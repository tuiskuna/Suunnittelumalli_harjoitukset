package src;
public interface PokemonState {
    void attack();
    void move();
    void tellColor();
    PokemonState nextState();
    void accept(PokemonVisitor visitor);
}