package src;
public class Charizard implements PokemonState{

    @Override
    public void attack() {
        System.out.println("Charizard uses Hyper Beam!");
    }

    @Override
    public PokemonState nextState() {
        System.out.println("I can not evolve anymore.");
        return this;
    }

    @Override
    public void move() {
        System.out.println("Now I can fly!");
    }

    @Override
    public void tellColor() {
        System.out.println("I'm dark orange.");
    }
    
    public void accept(PokemonVisitor visitor){
        visitor.visit(this);
    };
}