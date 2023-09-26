package src;
public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        for (int i = 0; i < 3; i++) {
            pokemon.printStatus();
            pokemon.attack();
            pokemon.evolve();
        }
    }
}