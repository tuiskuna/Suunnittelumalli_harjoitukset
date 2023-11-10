import java.util.ArrayList;

public class BurgerKingBurger {
    private ArrayList<String> burgerComponents = new ArrayList<>();

    public void addComponent(String component) {
        burgerComponents.add(component);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String component : burgerComponents) {
            result.append(component).append("\n"); //add newline to each component to format better
        }
        return result.toString();
    }
}

