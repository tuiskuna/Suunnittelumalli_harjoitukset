public class Adapter implements ITarget {
    private OldService oldService;


    public Adapter(OldService o){
        this.oldService = o;
    }

    @Override
    public String getService() {
        return oldService.getOldService();
    }
}
