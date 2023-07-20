package hexlet.code.games;

public final class Even  implements Gameable {
    private final String gameTitle = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private final int maxRandomNumber = 1000;

    @Override
    public QuizQuestion getNewQuizQuestion() {
        int randomNumber = Utils.generateRandomNumber(maxRandomNumber);

        String question = calculateQuestion(randomNumber);
        String rightAnswer = calculateRightAnswer(randomNumber);

        return new QuizQuestion(question, rightAnswer);
    }

    private String calculateQuestion(int randomNumber) {
        return "Question: " + randomNumber;
    }

    private String calculateRightAnswer(int randomNumber) {
        if ((randomNumber % 2) == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    @Override
    public String getGameTitle() {
        return gameTitle;
    }
}

