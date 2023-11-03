package src;

public  class Pokemon {
    private PokemonState currentState;

    public Pokemon() {
        currentState = new Charmander();
        System.out.println("It's Charmander!!");
    }

    public void setState(PokemonState newState){
        currentState = newState;
    }

    public void attack() {
        currentState.attack();
        currentState = currentState.nextState();
        System.out.println();
    }

    public void move() {
        currentState.move();
    }

    public void tellColor() {
        currentState.tellColor();
    }

    public void accept(PokemonVisitor visitor){
        currentState.accept(visitor);
    };
}


