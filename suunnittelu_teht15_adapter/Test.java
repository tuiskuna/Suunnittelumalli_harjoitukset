public class Test {
    public static void main(String[] args) {

        OldService oldService = new OldService();
        Adapter adapter = new Adapter(oldService);

        ClientClass client = new ClientClass(adapter);

        client.requestService();
    }
}
