public class Adapter implements ITarget {
    private OldService oldService;


    public Adapter(OldService o){
        this.oldService = o;
    }

    @Override
    public int getSum() {
        System.out.println("Requesting old sum from adaptee, old sum: " + oldService.getSum());
        int convertedSum = oldService.getSum() * 100;
        System.out.println("Converting sum by multiplying with 100");
        return convertedSum;
    }
}
