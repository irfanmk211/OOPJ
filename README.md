Overview
The Word Game is a simple interactive word-guessing game where the player is given hints and needs to guess the correct word. The game awards points for correct guesses and saves the player's score to an output file when the game ends.

Components
WordGame: The main class that drives the game logic, handles user input, and processes the word list.
Word: A class representing a word with a hint and associated points.
Player: A class representing the player, tracking their name and score.
FileHandler: A class responsible for reading and writing files (input and output).
GameInterface: An interface that defines the essential methods (startGame and endGame) that must be implemented by the WordGame class.
File Structure
WordGame.java: Contains the game logic and flow.
Word.java: Defines a word's properties (the word, the hint, and the points).
Player.java: Stores player information, including name and score.
FileHandler.java: Handles file reading and writing operations for input and output.
GameInterface.java: Defines the methods required for any game to implement (like start and end).
TestClass.java: A simple test class to run the game.
input1.txt: A sample input file (not included in the code, must be created by the user).
Game Flow
Starting the Game: The player is prompted with a welcome message and is informed that they will guess words based on hints.

Gameplay:

The game reads a list of words (with hints and points) from a file.
For each word, the game displays the hint and asks the player to guess the word.
If the player guesses correctly, they earn points based on the word's point value. If incorrect, the correct word is shown.
Ending the Game: Once all words have been guessed, the game ends, and the player's final score is displayed. The results are then saved in the output.txt file.

Requirements
Java 8 or higher
A text editor or IDE (like Eclipse, IntelliJ IDEA, or Visual Studio Code) for running the code.
A valid input1.txt file (see below).
