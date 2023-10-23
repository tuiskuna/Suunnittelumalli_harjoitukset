
public class Manager extends RaiseHandler{

    @Override
    public void handleRequest(double amount) {
        if (amount <= 2.0 ) {
            System.out.println("Manager has approved the raise of " + amount + "%");
        }
        else if (nextHandler != null){
            nextHandler.handleRequest(amount);
        }
    }
}
