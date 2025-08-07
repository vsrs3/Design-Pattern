package ChainOfResponsibility;

public abstract class Handler {
    protected Handler nextHandler;

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract boolean handle(int amount);
}