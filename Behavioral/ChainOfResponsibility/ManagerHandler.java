package ChainOfResponsibility;

public class ManagerHandler extends Handler {
    @Override
    public boolean handle(int amount) {
        if (amount <= 5000) {
            System.out.println("Manager approved expense of $" + amount);
            return true;
        } else if (nextHandler != null) {
            return nextHandler.handle(amount);
        }
        return false;
    }
}