package WordBank;



public class WordBank {
    // constants
    public String[] words = {"apple", "alpha", "apples", "xylaphone", "crocadile", "tager"};

    public void setDisplayWord(String displayWord) {
        this.displayWord = displayWord;
    }

    // variables
    public String displayWord = "";
    private String answerWord;

    //constructors
    public WordBank(byte numberOfLivesChosen) {
        this.setAnswerWord(words[(int) (Math.random() * words.length)]);
        createDisplayWord(numberOfLivesChosen);
    }
    //getters and setters
    public String getAnswerWord() {
        return this.answerWord;
    }

    private void setAnswerWord(String answerWord) {
        this.answerWord = answerWord;
    }
    //methods
    public void createDisplayWord(byte NumberOfLivesChosen) {
        for (byte i = 0; i < NumberOfLivesChosen + 1; i++) {
            this.displayWord = this.displayWord.concat("-");
        }
    }
}


// constants
// variables
//constructors
//getters and setters
//methods
//toString