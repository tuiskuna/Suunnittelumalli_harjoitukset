public class ClientClass {
    private Adapter adapter;

    public ClientClass(Adapter a){
        this.adapter = a;
    }
    public void requestService(){
        System.out.println("Client is requesting the adapter for old service: " + adapter.getService());
    }
}
