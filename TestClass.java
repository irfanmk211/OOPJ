public class TestClass {
    public static void main(String[] args) {
        String inputFilePath = "input1.txt"; // Ensure this file exists
        WordGame game = new WordGame("John", inputFilePath);
        game.startGame();
    }
}
