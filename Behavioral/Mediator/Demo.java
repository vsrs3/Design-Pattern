package Mediator;

public class Demo {
    public static void main(String[] args) {
        DialogMediator dialog = new DialogMediator();
        
        System.out.println("Simulating form interaction:");
        System.out.println();
        
        // Try to enable button by checking agreement
        dialog.getAgreeCheckbox().check();
        
        // Add name to enable submit
        dialog.getNameField().setText("John Doe");
        
        // Submit form
        dialog.getSubmitButton().click();
        
        System.out.println();
        
        // Uncheck agreement to disable submit
        dialog.getAgreeCheckbox().check();
    }
}