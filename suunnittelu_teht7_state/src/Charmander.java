package src;
public class Charmander extends PokemonState {

    @Override
    public void attack() {
        System.out.println("pieni tulipallo");
    }

    @Override
    public void evolve() {
        System.out.println("Charmander kehittyy Charmeleoniksi!");
    }

     @Override
    public void printStatus() {
        System.out.println("Charmander, ensimmäinen kehitysaste.");
    }
}
