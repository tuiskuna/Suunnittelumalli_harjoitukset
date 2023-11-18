public class Test {
    public static void main(String[] args) {

        OldService oldService = new OldService();
        Adapter adapter = new Adapter(oldService);

        ClientClass client = new ClientClass(adapter);

        int sum = client.requestService();
        System.out.println("The converted sum: " + sum);
    }
}
