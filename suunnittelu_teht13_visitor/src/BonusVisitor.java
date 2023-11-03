package src;

public class BonusVisitor implements PokemonVisitor {

    @Override
    public void visit(Charmander charmander) {
       System.out.println("Charmander gets 10 bonus points");
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        System.out.println("Charmeleon gets 50 bonus points");

    }

    @Override
    public void visit(Charizard charizard) {
       System.out.println("Charizard gets 100 bonus points");

    }
    
}
