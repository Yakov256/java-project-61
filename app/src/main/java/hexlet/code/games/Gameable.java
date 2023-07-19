package hexlet.code.games;

public interface Gameable {
    //public int getScore();

    void generateNewQuestion();

    QuizQuestion getQuizQuestion();

    //String getRightAnswer();

    String getGameTitle();

}
