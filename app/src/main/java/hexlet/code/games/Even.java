package hexlet.code.games;

public class Even  implements Gameable {
    private String question = "";
    private String rightAnswer = "";
    private final int maxRandomNumber = 1000;

    @Override
    public void generateNewQuestion() {
        int randomNumber = (int) (Math.random() * maxRandomNumber);
        question = "Question: " + randomNumber;
        if ((randomNumber % 2) == 0) {
            rightAnswer = "Yes";
        } else {
            rightAnswer = "No";
        }
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String getRightAnswer() {
        return rightAnswer;
    }

    @Override
    public String getGameTitle() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}

