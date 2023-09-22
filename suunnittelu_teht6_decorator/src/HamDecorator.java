package src;

public class HamDecorator extends PizzaDecorator{
    
    public HamDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getPrice(){
        return pizza.getPrice() + 5.0;
    }

    @Override
    public String description() {
        return pizza.description() + " kinkku";
    }


}

