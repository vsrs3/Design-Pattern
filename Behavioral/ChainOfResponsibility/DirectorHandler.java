package ChainOfResponsibility;

public class DirectorHandler extends Handler {
    @Override
    public boolean handle(int amount) {
        if (amount <= 20000) {
            System.out.println("Director approved expense of $" + amount);
            return true;
        } else if (nextHandler != null) {
            return nextHandler.handle(amount);
        }
        System.out.println("Expense of $" + amount + " requires board approval");
        return false;
    }
}