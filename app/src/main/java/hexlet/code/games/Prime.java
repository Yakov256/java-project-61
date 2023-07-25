package hexlet.code.games;

import hexlet.code.Utils;

public final class Prime implements Gameable {
    private final String gameTitle = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private final int maxRandomNumber = 100;

    @Override
    public QuizQuestion getNewQuizQuestion() {
        int randomNumber = Utils.generateRandomNumber(maxRandomNumber);
        String rightAnswer = (isPrime(randomNumber)) ? "Yes" : "No";

        return new QuizQuestion(String.valueOf(randomNumber), rightAnswer);
    }

    private Boolean isPrime(int randomNumber) {
        if (randomNumber < 2) {
            return false;
        }
        for (int i = 2; i < randomNumber / 2; i++) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getGameTitle() {
        return gameTitle;
    }
}
