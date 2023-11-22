public class ClientClass {
    //esittele ITarget tyyppisenä
    private Adapter adapter;

    //tähänkin parametrina ITarget
    public ClientClass(Adapter a){
        this.adapter = a;
    }
    public int requestService(){
        return adapter.getSum();
    }
}
