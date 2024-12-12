Word Game
This project is a Word Game built using Java. The game allows the player to guess words based on hints provided, and it tracks the player’s score. The game’s results are stored in an output file, and various game-related functionalities are handled programmatically.
Features
•	Start Game: Begin the game and guess words based on hints.
•	Track Score: Accumulate points for each correct guess.
•	Word List: The words and their corresponding hints are read from an input file (input1.txt).
•	Output Results: After the game ends, the player’s score and details are saved in an output file (output.txt).
•	Game Flow: Display each word's hint, accept player guesses, and calculate the final score.
Software Requirements
1. Java JDK
•	The project requires Java JDK 11 or higher for compiling and running the Java code.
•	You can download it from Oracle's official website or use an open-source version like OpenJDK.
2. Integrated Development Environment (IDE)
•	The project can be developed and executed using any Java-compatible IDE, such as IntelliJ IDEA, Eclipse, or Visual Studio Code.
•	Recommended IDE: IntelliJ IDEA for its excellent Java support.
•	Installation:
o	IntelliJ IDEA: Download Link
3. Git
•	Git is used for version control to track changes and manage the project history.
•	You can download Git from here.
4. GitHub
•	GitHub is used to host the project’s repository, enabling easy collaboration and version management.
•	The project repository can be accessed at: GitHub Repo Link.
Classes and Interfaces
1. GameInterface (Interface)
This interface defines the methods for starting and ending the game.
Methods:
•	void startGame(): Starts the game, displays the first word and its hint, and processes guesses.
•	void endGame(): Ends the game, displays the player's score, and saves the result to an output file.
________________________________________
2. Player (Class)
Represents a player and tracks their score during the game.
Attributes:
•	name (String): The name of the player.
•	score (int): The total score accumulated by the player during the game.
Methods:
•	Player(String name): Constructor that initializes the player with a name.
•	String getName(): Returns the player’s name.
•	int getScore(): Returns the player’s current score.
•	void updateScore(int points): Updates the player’s score by adding the specified points.
________________________________________
3. Word (Class)
Represents a word in the game, including its hint and point value.
Attributes:
•	word (String): The word to be guessed.
•	hint (String): The hint that helps the player guess the word.
•	points (int): The points awarded for guessing the word correctly.
Methods:
•	Word(String word, String hint, int points): Constructor that initializes the word, hint, and points.
•	String getWord(): Returns the word.
•	String getHint(): Returns the hint.
•	int getPoints(): Returns the points for guessing the word correctly.
________________________________________
4. FileHandler (Class)
Handles file operations for reading input data and writing output results.
Methods:
•	List<Word> readInputFile(String filePath): Reads the input file and returns a list of Word objects.
•	void writeOutputFile(String filePath, String content): Writes the final results to the output file.
________________________________________
5. WordGame (Class)
Implements the logic for running the game, managing the player’s score, and displaying the results.
Attributes:
•	List<Word> wordList: List of words read from the input file.
•	Player player: The player participating in the game.
•	FileHandler fileHandler: The file handler that manages input and output files.
Methods:
•	WordGame(String playerName, String inputFilePath): Constructor that initializes the player and loads the words from the input file.
•	void startGame(): Starts the game, handles word guesses, and tracks the player’s score.
•	void endGame(): Ends the game and writes the player’s results to the output file.
________________________________________
6. TestClass (Class)
Contains the main method that initializes and starts the game.
Methods:
•	main(String[] args): Main entry point of the program. Initializes the WordGame with a player’s name and an input file path, and starts the game.
________________________________________
Files
1. Input File (input1.txt)
The input file contains a list of words, hints, and point values, formatted as follows:
Apple,Fruit,10
Table,Furniture,15
Python,Programming Language,20
Laptop,Electronic Device,25
Guitar,Musical Instrument,30
2. Output File (output.txt)
After the game, the output file contains the player’s score and game summary:
Player: John
Score: 100
________________________________________
This README.md file outlines the features, software requirements, and provides details about the classes and methods in the Word Game project. You can now modify or enhance it according to specific details or further project adjustments.
Let me know if you need any additional help!

