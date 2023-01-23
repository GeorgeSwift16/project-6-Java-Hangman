package GameOperation;

public class GameOperation {
    public byte numberOfLives;
    public byte guessCount = 0;
    public boolean isGameOver = (this.numberOfLives - this.guessCount) > (byte) 0;
    public GameOperation(byte numberOfLivesChosen) {
        this.numberOfLives = numberOfLivesChosen;
    }
}


// constants
// variables
//constructors
//getters and setters
//methods
//toString