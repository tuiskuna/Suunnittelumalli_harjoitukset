public class Ceo extends RaiseHandler {

    @Override
    public void handleRequest(double amount) {
        if (amount > 5.0 ) {
            System.out.println("The ceo has approved the raise of " + amount + "%");
        }
    }
}
