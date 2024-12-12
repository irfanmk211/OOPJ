import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class WordGame implements GameInterface {
    private List<Word> wordList;
    private Player player;
    private FileHandler fileHandler;

    public WordGame(String playerName, String inputFilePath) {
        this.player = new Player(playerName);
        this.fileHandler = new FileHandler();
        try {
            this.wordList = fileHandler.readInputFile(inputFilePath);
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
        }
    }

    @Override
    public void startGame() {
        if (wordList == null || wordList.isEmpty()) {
            System.out.println("No words to play with. Exiting game.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Word Game, " + player.getName() + "!");
        System.out.println("You will be given a hint. Guess the word to earn points!");

        for (Word word : wordList) {
            System.out.println("Hint:" + word.getHint());
            System.out.print("Your guess: ");
            String userGuess = scanner.nextLine().trim();

            if (userGuess.equalsIgnoreCase(word.getWord())) {
                System.out.println("Correct! You earned " + word.getPoints() + " points.");
                player.updateScore(word.getPoints());
            } else {
                System.out.println("Wrong! The correct word was: " + word.getWord());
            }
        }
        scanner.close();
        endGame();
    }

    @Override
    public void endGame() {
        System.out.println("Game Over!");
        System.out.println("Player: " + player.getName());
        System.out.println("Final Score: " + player.getScore());

        String output = "Player: " + player.getName() + "\n"
                + "Score: " + player.getScore() + "\n";
        try {
            fileHandler.writeOutputFile("output.txt", output);
            System.out.println("Results saved to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }
}
