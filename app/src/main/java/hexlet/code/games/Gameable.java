package hexlet.code.games;

public interface Gameable {
    //public int getScore();

    void generateNewQuestion();

    String getQuestion();

    String getRightAnswer();

    String getGameTitle();

}
