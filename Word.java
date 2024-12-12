public class Word {
    private String word;
    private String hint;
    private int points;

    public Word(String word, String hint, int points) {
        this.word = word;
        this.hint = hint;
        this.points = points;
    }

    public String getWord() {
        return word;
    }

    public String getHint() {
        return hint;
    }

    public int getPoints() {
        return points;
    }
}