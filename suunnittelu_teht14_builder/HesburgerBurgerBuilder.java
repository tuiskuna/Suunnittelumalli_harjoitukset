public class HesburgerBurgerBuilder implements Builder {

private HesburgerBurger burger;

    @Override
    public void createNewBurgerProduct() {
        burger = new HesburgerBurger();
    }

    @Override
    public void buildSalad() {
        burger.buildSalad("Fresh lettuce");
    }

    @Override
    public void buildBun() {
        burger.buildBun("Sesame seed bun");
    }

    @Override
    public void buildPatty() {
        burger.buildPatty("Juicy beef patty");
    }

    @Override
    public Object getBurger() {
        return burger;
    }
}