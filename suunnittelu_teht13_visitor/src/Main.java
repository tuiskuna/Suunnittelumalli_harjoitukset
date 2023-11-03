package src;
public class Main {
    public static void main(String[] args){
        Pokemon pokemon = new Pokemon();
        PokemonVisitor visitor = new BonusVisitor();

        for (int i = 0; i < 3; i++) {
            pokemon.accept(visitor);
            pokemon.move();
            pokemon.tellColor();
            pokemon.attack();
        }
    }
}