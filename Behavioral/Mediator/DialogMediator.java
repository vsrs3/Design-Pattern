package Mediator;

public class DialogMediator implements Mediator {
    private Button submitButton;
    private TextBox nameField;
    private CheckBox agreeCheckbox;

    public DialogMediator() {
        this.submitButton = new Button(this);
        this.nameField = new TextBox(this);
        this.agreeCheckbox = new CheckBox(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == agreeCheckbox && event.equals("check")) {
            if (agreeCheckbox.isChecked() && !nameField.getText().isEmpty()) {
                System.out.println("Submit button enabled");
            } else {
                System.out.println("Submit button disabled");
            }
        }
        
        if (sender == nameField && event.equals("textChanged")) {
            if (agreeCheckbox.isChecked() && !nameField.getText().isEmpty()) {
                System.out.println("Submit button enabled");
            } else {
                System.out.println("Submit button disabled");
            }
        }
        
        if (sender == submitButton && event.equals("click")) {
            System.out.println("Form submitted with name: " + nameField.getText());
        }
    }

    public Button getSubmitButton() {
        return submitButton;
    }

    public TextBox getNameField() {
        return nameField;
    }

    public CheckBox getAgreeCheckbox() {
        return agreeCheckbox;
    }
}