package Memento;

public class TextEditor {
    private String content;
    private int cursorPosition;

    public TextEditor() {
        this.content = "";
        this.cursorPosition = 0;
    }

    public void write(String text) {
        content += text;
        cursorPosition = content.length();
        System.out.println("Current content: '" + content + "'");
    }

    public void setCursor(int position) {
        if (position >= 0 && position <= content.length()) {
            this.cursorPosition = position;
        }
    }

    public EditorMemento save() {
        return new EditorMemento(content, cursorPosition);
    }

    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
        this.cursorPosition = memento.getCursorPosition();
        System.out.println("Restored content: '" + content + "'");
    }

    public String getContent() {
        return content;
    }

    public int getCursorPosition() {
        return cursorPosition;
    }
}