package hexlet.code.games;

import hexlet.code.Utils;

public final class GCD implements Gameable {
    private final String gameTitle = "Find the greatest common divisor of given numbers.";
    private final int maxRandomNumber = 50;

    @Override
    public QuizQuestion getNewQuizQuestion() {
        int randomNumber1 =  Utils.generateRandomNumber(maxRandomNumber);
        int randomNumber2 =  Utils.generateRandomNumber(maxRandomNumber);

        String question = randomNumber1 + " " + randomNumber2;
        String rightAnswer = String.valueOf(getGCD(randomNumber1, randomNumber2));

        return new QuizQuestion(question, rightAnswer);
    }

    private int getGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    @Override
    public String getGameTitle() {
        return gameTitle;
    }
}
