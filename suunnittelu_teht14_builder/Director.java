public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void createBurger() {
        builder.createNewBurgerProduct();
        builder.buildSalad();
        builder.buildBun();
        builder.buildPatty();
    }
    public Object getBurger() {
        return builder.getBurger();
    }
}