
public class ChainMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnitManager unitManager = new UnitManager();
        Ceo ceo = new Ceo();

        manager.setNextHandler(unitManager);
        unitManager.setNextHandler(ceo);

        manager.handleRequest(1.5);
        manager.handleRequest(3.4);
        manager.handleRequest(4.4);
        manager.handleRequest(6.0);
    



    }
}