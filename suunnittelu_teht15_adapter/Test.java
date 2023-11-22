public class Test {
    public static void main(String[] args) {

        OldService oldService = new OldService();
        //tänne kans se ITarget
        Adapter adapter = new Adapter(oldService);

        ClientClass client = new ClientClass(adapter);

        //voidaan lisätä kanssa uusia servicejä joita ei käytetän adapterin kautta vaan ne menee suoraan Itarget rajapinnan kautta
        
        int sum = client.requestService();
        System.out.println("The converted sum: " + sum);
    }
}
