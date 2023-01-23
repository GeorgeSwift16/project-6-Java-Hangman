package GameOperation;

public class GameOperation {
    public byte numberOfLives;
    public byte guessCount = 0;
    public byte livesRemaining () {
        return (byte) (this.numberOfLives - this.guessCount);
    }
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