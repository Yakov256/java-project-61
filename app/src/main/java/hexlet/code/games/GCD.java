package hexlet.code.games;

public final class GCD implements Gameable {
    private final String gameTitle = "Find the greatest common divisor of given numbers.";
    private final int maxRandomNumber = 50;
    private String question = "";
    private String rightAnswer = "";

    @Override
    public void generateNewQuestion() {
        int randomNumber1 =  (int) (Math.random() * maxRandomNumber);
        int randomNumber2 =  (int) (Math.random() * maxRandomNumber);

        question = calculateQuestion(randomNumber1, randomNumber2);
        rightAnswer = calculateRightAnswer(randomNumber1, randomNumber2);
    }

    private String calculateQuestion(int randomNumber1, int randomNumber2) {
        return "Question: " + randomNumber1 + " " + randomNumber2;
    }

    private String calculateRightAnswer(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return String.valueOf(a);
    }

    @Override
    public QuizQuestion getQuizQuestion() {
        return new QuizQuestion(question, rightAnswer);
    }

    @Override
    public String getGameTitle() {
        return gameTitle;
    }
}
