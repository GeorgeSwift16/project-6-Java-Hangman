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

//answer word = hello
//        display word = -----
//        user guess = g


        GameOperation game = new GameOperation(numberOfLivesChosen);
        WordBank bank = new WordBank(numberOfLivesChosen);
        while ( (!game.isGameOver) || bank.displayWord.contains("-")) {
            System.out.println(bank.displayWord);
            System.out.println("Guess a Word!");
            char userGuess = input.next().toLowerCase().charAt(0);

            game.guessCount++;
            for (int i = 0; i < bank.getAnswerWord().length(); i++) {
                char characterToReplace = bank.getAnswerWord().charAt(i);
                if (characterToReplace == userGuess) {
                    System.out.println("its a match");
                    String updateWord = bank.displayWord.replace(characterToReplace, userGuess);
                    System.out.println(updateWord);
                    bank.setDisplayWord(updateWord);
                }
            }
            if (bank.displayWord.equals(bank.getAnswerWord())) {
                System.out.println("you win!");
            }
        }
        System.out.println("you lose");
    }

}



