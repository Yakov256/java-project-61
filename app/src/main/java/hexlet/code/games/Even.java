package hexlet.code.games;

import hexlet.code.Utils;

public final class Even  implements Gameable {
    private final String gameTitle = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private final int maxRandomNumber = 1000;

    @Override
    public QuizQuestion getNewQuizQuestion() {
        int randomNumber = Utils.generateRandomNumber(maxRandomNumber);
        String rightAnswer = (isEven(randomNumber)) ? "Yes" : "No";

        return new QuizQuestion(String.valueOf(randomNumber), rightAnswer);
    }

    private boolean isEven(int number) {
        return ((number % 2) == 0);
    }

    @Override
    public String getGameTitle() {
        return gameTitle;
    }
}

