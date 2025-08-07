package ChainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        // Create handlers
        Handler teamLead = new TeamLeadHandler();
        Handler manager = new ManagerHandler();
        Handler director = new DirectorHandler();
        
        // Set up chain
        teamLead.setNext(manager);
        manager.setNext(director);
        
        // Test different amounts
        System.out.println("Testing expense approvals:");
        System.out.println();
        
        teamLead.handle(500);    // Team Lead
        teamLead.handle(3000);   // Manager
        teamLead.handle(15000);  // Director
        teamLead.handle(25000);  // Too high, needs board approval
    }
}