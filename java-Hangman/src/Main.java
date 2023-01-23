import GameOperation.GameOperation;
import WordBank.WordBank;


import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Hangman \nPlease enter your name");
        String userName = input.nextLine().toUpperCase();
        System.out.println("How many lives would you like? Please enter a number between 3 and 8. \n We recommend: \n 3: For Experts \n 5: For Average players \n 8: For first time players");
        byte numberOfLivesChosen = input.nextByte();
        String gameStartMessage = String.format("So, %s you have selected %s lives lets play!", userName, numberOfLivesChosen);
        System.out.println(gameStartMessage);



        GameOperation game = new GameOperation(numberOfLivesChosen);
        WordBank bank = new WordBank(numberOfLivesChosen);
        while (game.livesRemaining() > 0 || bank.displayWord.contains("-") ) {
            System.out.println(bank.displayWord);
            System.out.println("Guess a Word!");
            String userGuess = input.next();
            String userGuessChecked = userGuess.substring(0,0);
            game.guessCount ++;
            for (int i = 0; i < bank.getAnswerWord().length(); i++) {
                if (userGuessChecked.charAt(0) == bank.getAnswerWord().charAt(i)) {
                    bank.displayWord = bank.displayWord.replace(bank.getAnswerWord().charAt(i), userGuessChecked.charAt(i));
                }
            }
            if (bank.displayWord.equals(bank.getAnswerWord())) {
                System.out.println("you win!");
            }
        }
        if (game.guessCount == (int) numberOfLivesChosen) {
            System.out.println("you lose");
        }

    }


}
