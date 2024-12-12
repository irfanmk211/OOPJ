import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    public List<Word> readInputFile(String filePath) throws IOException {
        List<Word> wordList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String word = parts[0].trim();
                    String hint = parts[1].trim();
                    int points = Integer.parseInt(parts[2].trim());
                    wordList.add(new Word(word, hint, points));
                }
            }
        }
        return wordList;
    }

    public void writeOutputFile(String filePath, String content) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(content);
        }
    }
}