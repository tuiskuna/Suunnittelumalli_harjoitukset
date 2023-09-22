package src;

public class PineappleDecorator extends PizzaDecorator {

    public PineappleDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.5;
    }

    @Override
    public String description() {
       return pizza.description() + " ananas";
    }

}