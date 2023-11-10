public class Client {
    public static void main(String[] args) {
        // For Hesburger
        Builder hesburgerBuilder = new HesburgerBurgerBuilder();
        Director hesburgerDirector = new Director(hesburgerBuilder);

        hesburgerDirector.createBurger();
        HesburgerBurger hesburgerBurger = (HesburgerBurger) hesburgerDirector.getBurger();
        System.out.println("Hesburger Burger:\n" + hesburgerBurger);

        // For Burger King
        Builder burgerKingBuilder = new BurgerKingBurgerBuilder();
        Director burgerKingDirector = new Director(burgerKingBuilder);

        burgerKingDirector.createBurger();
        BurgerKingBurger burgerKingBurger = (BurgerKingBurger) burgerKingDirector.getBurger();
        System.out.println("Burger King Burger:\n" + burgerKingBurger);
    }
}