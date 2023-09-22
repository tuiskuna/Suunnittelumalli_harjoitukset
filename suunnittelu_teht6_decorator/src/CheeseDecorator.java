package src;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getPrice(){
        return pizza.getPrice() + 3.2;
    }

    @Override
    public String description(){
        return pizza.description() + " juusto";
    }
}
 