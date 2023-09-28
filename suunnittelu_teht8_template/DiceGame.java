import java.util.Random;

public class DiceGame extends Game{
    
    private int[] playersScores;
    private int winningScore;
    private int currentPlayer;

    void initializeGame() {
        //initialize the score array to be length of players
        playersScores = new int[playersCount];
        //all scores are 0 at beginning
        for (int i = 0; i < playersCount; i++) {
            playersScores[i] = 0;
        }
        //defining score to win
        winningScore = 100;
        currentPlayer = 0;
        System.out.println("Dice Game Started with " + playersCount + " players.");
    }

    void makePlay(int player) {
        //throw the dice (random nuber from 1-6)
        Random rand = new Random();
        int diceRoll = rand.nextInt(6) + 1; 
        //add the number to players score
        playersScores[player] += diceRoll;
        System.out.println("Player " + (player + 1) + " rolled a " + diceRoll + ".");
        System.out.println("Player " + (player + 1) + " now has a total score of " + playersScores[player] + ".");
    }

    boolean endOfGame() {
        for (int i = 0; i < playersCount; i++) {
            if (playersScores[i] >= winningScore) {
                return true;
            }
        }
        return false;
    }

    void printWinner() {
        int maxScore = 0;
        int winningPlayer = -1;
        for (int i = 0; i < playersCount; i++) {
            if (playersScores[i] > maxScore) {
                maxScore = playersScores[i];
                winningPlayer = i;
            }
        }
        System.out.println("Player " + (winningPlayer + 1) + " wins with a score of " + maxScore + "!");
    }
}