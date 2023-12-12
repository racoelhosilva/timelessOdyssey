package timelessodyssey.model.credits;

public class Credits {

    private int score;

    public Credits(int starCounter) {
        this.score = starCounter;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String[] getMessages() {
        String[] strings = new String[2];
        strings[0] = "Game Over!";
        strings[1] = "Thank you for playing :)";
        return strings;
    }

    public String[] getNames() {
        String[] strings = new String[3];
        strings[0] = "Bruno Oliveira";
        strings[1] = "Joao Mendes";
        strings[2] = "Rodrigo Coelho";
        return strings;
    }
}
