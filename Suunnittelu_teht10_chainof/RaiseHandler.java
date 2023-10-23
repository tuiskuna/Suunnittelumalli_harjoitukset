abstract public class RaiseHandler {
    protected RaiseHandler nextHandler;

    public void setNextHandler(RaiseHandler next){ 
        this.nextHandler = next;
    }
    public abstract void handleRequest(double amount);
}
