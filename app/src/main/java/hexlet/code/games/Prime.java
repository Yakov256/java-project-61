package hexlet.code.games;

public class Prime implements Gameable {
    private String question = "";
    private String rightAnswer = "";

    @Override
    public void generateNewQuestion() {
        int randomNumber = (int) (Math.random() * 50);
        question = "Question: " + randomNumber;
        rightAnswer = isSimple(randomNumber);
    }

    public static String isSimple(Integer number) {
        if (number < 2) {
            return "No";
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return "No";
            }
        }
        return "Yes";
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
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
