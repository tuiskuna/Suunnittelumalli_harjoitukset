package src;
public class Charmeleon extends PokemonState {
    @Override
    public void attack() {
        System.out.println("iso tulipallo!");
    }
    
    @Override
    public void evolve() {
        System.out.println("Charmeleon kehittyy Charizardiksi!");
    }
    @Override
    public void printStatus() {
        System.out.println("Charmeleon, toinen kehitysaste.");
    }
}
