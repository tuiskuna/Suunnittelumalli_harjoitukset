package src;

public class PizzaMain {
    public static void main(String[] args) {
    
        Pizza pizza1 = new Pizzapohja();

        pizza1 = new SauceDecorator(pizza1);
        pizza1 = new CheeseDecorator(pizza1);
        pizza1 = new HamDecorator(pizza1);

        Pizza pizza2 = new Pizzapohja();

        pizza2 = new SauceDecorator(pizza2);
        pizza2 = new CheeseDecorator(pizza2);
        pizza2 = new PineappleDecorator(pizza2);

        Pizza pizza3 = new Pizzapohja();

        pizza3 = new SauceDecorator(pizza3);
        pizza3 = new CheeseDecorator(pizza3);
        pizza3 = new PineappleDecorator(pizza3);

        System.out.println("Pizza menu:");
        System.out.println("1." + pizza1.description() + " : " + pizza1.getPrice());
        System.out.println("2." + pizza2.description() + " : " + pizza2.getPrice());
        System.out.println("3." + pizza3.description() + " : " + pizza3.getPrice());



    }
    
}
