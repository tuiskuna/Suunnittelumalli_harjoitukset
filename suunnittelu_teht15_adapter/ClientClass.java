public class ClientClass {
    //esittele ITarget tyyppisenä
    private Adapter adapter;

    //tähänkin parametrina ITarget
    public ClientClass(Adapter a){
        this.adapter = a;
    }
    public int requestService(){
        //tänne voisi sitten lisätä niitä uusia eri servicejä, vois antaa esim parametreina.
        return adapter.getSum();
    }
}
