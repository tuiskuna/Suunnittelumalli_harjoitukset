
public class UnitManager extends RaiseHandler {

    @Override
    public void handleRequest(double amount) {
        if (amount > 2.0 && amount <= 5.0) {
            System.out.println("The unit manager has approved the raise of " + amount + "%");
        }
        else if (nextHandler != null){
            nextHandler.handleRequest(amount);
        }
    }
}
