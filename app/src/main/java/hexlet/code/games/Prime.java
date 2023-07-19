package hexlet.code.games;

public final class Prime implements Gameable {
    private final String gameTitle = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private final int maxRandomNumber = 100;
    private String question = "";
    private String rightAnswer = "";

    @Override
    public void generateNewQuestion() {
        int randomNumber = (int) (Math.random() * maxRandomNumber);
        question = calculateQuestion(randomNumber);
        rightAnswer = calculateRightAnswer(randomNumber);
    }

    private String calculateQuestion(int randomNumber) {
        return "Question: " + randomNumber;
    }

    private String calculateRightAnswer(int randomNumber) {
        if (randomNumber < 2) {
            return "No";
        }
        for (int i = 2; i < randomNumber / 2; i++) {
            if (randomNumber % i == 0) {
                return "No";
            }
        }
        return "Yes";
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
