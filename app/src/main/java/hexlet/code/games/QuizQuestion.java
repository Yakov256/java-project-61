package hexlet.code.games;

public final class QuizQuestion {
    private String question;
    private String rightAnswer;

    /* checkstyle ругается, пришлось переименовать параметры метода
    public QuizQuestion(String question, String rightAnswer) {
        this.question = question;
        this.rightAnswer = rightAnswer;
    }
    */
    public QuizQuestion(String question1, String rightAnswer1) {
        this.question = question1;
        this.rightAnswer = rightAnswer1;
    }

    public String getQuestion() {
        return question;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

}
