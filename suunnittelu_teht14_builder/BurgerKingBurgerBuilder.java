public class BurgerKingBurgerBuilder implements Builder {
    private BurgerKingBurger burger;

    @Override
    public void createNewBurgerProduct() {
        burger = new BurgerKingBurger();
    }

    @Override
    public void buildSalad() {
        burger.addComponent("Crispy salad");
    }

    @Override
    public void buildBun() {
        burger.addComponent("Soft grilled buns");
    }

    @Override
    public void buildPatty() {
        burger.addComponent("Grilled patty with Burger King speciality");
    }

    @Override
    public Object getBurger() {
        return burger;
    }
}