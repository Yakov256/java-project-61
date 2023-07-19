package hexlet.code.games;

public final class Even  implements Gameable {
    private final String gameTitle = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private final int maxRandomNumber = 1000;
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
        if ((randomNumber % 2) == 0) {
            return "Yes";
        } else {
            return "No";
        }
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

