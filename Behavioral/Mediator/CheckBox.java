package Mediator;

public class CheckBox extends Component {
    private boolean checked = false;

    public CheckBox(Mediator mediator) {
        super(mediator);
    }

    public void check() {
        checked = !checked;
        System.out.println("CheckBox is now " + (checked ? "checked" : "unchecked"));
        mediator.notify(this, "check");
    }

    public boolean isChecked() {
        return checked;
    }
}