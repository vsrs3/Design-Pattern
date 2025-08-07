package Memento;

public class Demo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        // Initial save
        history.push(editor.save());

        // Type some text
        editor.write("Hello ");
        history.push(editor.save());

        editor.write("World!");
        history.push(editor.save());

        editor.write(" How are you?");
        history.push(editor.save());

        System.out.println("\n--- Undoing changes ---");
        
        // Undo to previous state
        EditorMemento memento = history.undo();
        if (memento != null) {
            editor.restore(memento);
        }

        // Undo again
        memento = history.undo();
        if (memento != null) {
            editor.restore(memento);
        }

        System.out.println("\n--- Redoing changes ---");
        
        // Redo
        memento = history.redo();
        if (memento != null) {
            editor.restore(memento);
        }
    }
}