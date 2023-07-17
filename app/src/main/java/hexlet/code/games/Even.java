package hexlet.code.games;

public class Even  implements Gameable {
    private String question = "";
    private String rightAnswer = "";

    @Override
    public void generateNewQuestion() {
        int randomNumber = (int) (Math.random() * 1000);
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

