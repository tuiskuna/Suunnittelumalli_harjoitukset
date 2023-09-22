package src;

public class SauceDecorator extends PizzaDecorator {
    public SauceDecorator(Pizza pizza) {
        super(pizza); // Saadaan yläluokalta pizza, johon lisätään täytettä
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.0;
    }

    @Override
    public String description() {
        return pizza.description() + " kastike";
    }
}





