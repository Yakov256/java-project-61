package hexlet.code.games;

public class GCD implements Gameable{
    private final String GAME_TITLE = "Find the greatest common divisor of given numbers.";
    private final int MAX_RANDOM_NUMBER = 50;
    private String question = "";
    private String rightAnswer = "";

    @Override
    public void generateNewQuestion() {
        int randomNumber1 =  (int) (Math.random() * MAX_RANDOM_NUMBER);
        int randomNumber2 =  (int) (Math.random() * MAX_RANDOM_NUMBER);

        question = "Question: " + randomNumber1 + " " + randomNumber2;
        rightAnswer = String.valueOf(getGCD(randomNumber1, randomNumber2));
    }

    private static int getGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
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
        return GAME_TITLE;
    }
}
