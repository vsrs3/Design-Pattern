package Memento;

import java.util.ArrayList;
import java.util.List;

public class EditorHistory {
    private List<EditorMemento> history;
    private int currentIndex;

    public EditorHistory() {
        this.history = new ArrayList<>();
        this.currentIndex = -1;
    }

    public void push(EditorMemento memento) {
        // Remove any history after current index (for new branches)
        while (history.size() > currentIndex + 1) {
            history.remove(history.size() - 1);
        }
        
        history.add(memento);
        currentIndex++;
    }

    public EditorMemento undo() {
        if (currentIndex > 0) {
            currentIndex--;
            return history.get(currentIndex);
        }
        return null;
    }

    public EditorMemento redo() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            return history.get(currentIndex);
        }
        return null;
    }
}