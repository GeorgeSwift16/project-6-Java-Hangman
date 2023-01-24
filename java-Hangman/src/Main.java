import GameOperation.GameOperation;
import WordBank.WordBank;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Hangman \nPlease enter your name");
        String userName = input.nextLine().toUpperCase();
        System.out.println("How many lives would you like? Please enter a number between 3 and 8. \n We recommend: \n 3: For Experts \n 5: For Average players \n 8: For first time players");
        int numberOfLivesChosen = input.nextInt();
        String gameStartMessage = String.format("So, %s you have selected %s lives lets play!", userName, numberOfLivesChosen);
        System.out.println(gameStartMessage);



        GameOperation game = new GameOperation(numberOfLivesChosen);
        WordBank bank = new WordBank(numberOfLivesChosen);

        while (game.numberOfLives > game.guessCount) {
            System.out.println(bank.displayWord);
            System.out.println("Guess a Word!");
            char userGuess = input.next().toLowerCase().charAt(0);
            bank.storeUserGuess(userGuess);
            game.guessCount++;
            for (int i = 0; i < bank.answerWord.length(); i++) {

                char characterToReplace = bank.answerWord.charAt(i);
                if (characterToReplace == userGuess) {
                    StringBuilder answerWord = new StringBuilder(bank.displayWord);
                    answerWord.setCharAt(i, characterToReplace);
                    bank.setDisplayWord(answerWord.toString());

                }
            }
            if (!bank.displayWord.contains("-")) {
                System.out.println("you win!");
                break;
            }
            System.out.println("you have " + (game.numberOfLives - game.guessCount) + " lives remaining");
            System.out.println("your previous guesses were " + bank.previousGuesses);
        }
        System.out.println("game over");
    }

}



