package ChainOfResponsibility;

public class TeamLeadHandler extends Handler {
    @Override
    public boolean handle(int amount) {
        if (amount <= 1000) {
            System.out.println("Team Lead approved expense of $" + amount);
            return true;
        } else if (nextHandler != null) {
            return nextHandler.handle(amount);
        }
        return false;
    }
}