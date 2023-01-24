package WordBank;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WordBank {
    // constants
    public String[] words = {"apple", "alpha", "apples", "xylaphone", "crocadile", "tager"};
    public String answerWord;

    public Queue<Character> previousGuesses = new LinkedList<>();
    public String displayWord = "";
    public void setDisplayWord(String displayWord) {
        this.displayWord = displayWord;
    }


    //constructors
    public WordBank(int numberOfLivesChosen) {
        this.setAnswerWord(words[(int) (Math.random() * words.length)]);
        createDisplayWord(this.answerWord);
    }
    //getters and setters

    private void setAnswerWord(String answerWord) {
        this.answerWord = answerWord;
    }
    //methods
    public void createDisplayWord(String answerWord) {
        for (int i = 0; i < answerWord.length(); i++) {
            this.displayWord = this.displayWord.concat("-");
        }
    }
    public void storeUserGuess(char userGuess) {
        this.previousGuesses.add(userGuess);
    }
}


// constants
// variables
//constructors
//getters and setters
//methods
//toString