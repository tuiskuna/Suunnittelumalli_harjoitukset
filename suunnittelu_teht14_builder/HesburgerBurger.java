public class HesburgerBurger {
    private StringBuilder burgerComponents;

    public HesburgerBurger() {
        this.burgerComponents = new StringBuilder();
    }
    // Extra append with newline to make formatting better
    public void buildSalad(String salad) {
        burgerComponents.append(salad).append("\n");
    }

    public void buildBun(String bun) {
        burgerComponents.append(bun).append("\n");
    }

    public void buildPatty(String patty) {
        burgerComponents.append(patty).append("\n");
    }

    @Override
    public String toString() {
        return burgerComponents.toString();
    }
}