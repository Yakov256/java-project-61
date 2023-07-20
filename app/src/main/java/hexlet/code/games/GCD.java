package hexlet.code.games;

public final class GCD implements Gameable {
    private final String gameTitle = "Find the greatest common divisor of given numbers.";
    private final int maxRandomNumber = 50;

    @Override
    public QuizQuestion getNewQuizQuestion() {
        int randomNumber1 =  Utils.generateRandomNumber(maxRandomNumber);
        int randomNumber2 =  Utils.generateRandomNumber(maxRandomNumber);

        String question = calculateQuestion(randomNumber1, randomNumber2);
        String rightAnswer = calculateRightAnswer(randomNumber1, randomNumber2);

        return new QuizQuestion(question, rightAnswer);
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
    public String getGameTitle() {
        return gameTitle;
    }
}
