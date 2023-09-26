package src;

public class Pokemon {
    
    private PokemonState currentState;

    public Pokemon() {
        currentState = new Charmander(); // Alussa Charmander-tila
    }

    public void attack() {
        currentState.attack();
    }

    public void evolve() {
        currentState.evolve();
        if (currentState instanceof Charmander) {
            currentState = new Charmeleon();
        } else if (currentState instanceof Charmeleon) {
            currentState = new Charizard();
        }
    }

    public void printStatus() {
        currentState.printStatus();
    }
}


