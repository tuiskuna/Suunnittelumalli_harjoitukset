public class ClientClass {
    private Adapter adapter;

    public ClientClass(Adapter a){
        this.adapter = a;
    }
    public int requestService(){
        return adapter.getSum();
    }
}
