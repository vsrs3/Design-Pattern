package Mediator;

public class TextBox extends Component {
    private String text = "";

    public TextBox(Mediator mediator) {
        super(mediator);
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("TextBox text set to: " + text);
        mediator.notify(this, "textChanged");
    }

    public String getText() {
        return text;
    }
}