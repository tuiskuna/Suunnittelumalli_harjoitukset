package src;
public class Charizard extends PokemonState {
    @Override
    public void attack() {
        System.out.println("Jättitulipallo!");
    }

    @Override
    public void evolve() {
        System.out.println("Olen jo Charizard, en voi enää kehittyä!");
    }

    @Override
    public void printStatus() {
        System.out.println("Charizard, lopullinen kehitysaste.");
    }
}
