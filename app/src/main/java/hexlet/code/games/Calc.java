package hexlet.code.games;

public class Calc implements Gameable {

    private final String GAME_TITLE = "What is the result of the expression?";
    private final int MAX_RANDOM_NUMBER = 50;
    private String question = "";
    private String rightAnswer = "";

    @Override
    public void generateNewQuestion() {

        int randomMathOperation = (int) (Math.random() * 3);
        int randomNumber1 =  (int) (Math.random() * MAX_RANDOM_NUMBER);
        int randomNumber2 =  (int) (Math.random() * MAX_RANDOM_NUMBER);
        String mathOperation = "";

        if (randomMathOperation == 0) {
            mathOperation = "+";
            rightAnswer = String.valueOf(randomNumber1 + randomNumber2);
        } else if (randomMathOperation == 1) {
            mathOperation = "-";
            rightAnswer = String.valueOf(randomNumber1 - randomNumber2);
        } else {
            mathOperation = "*";
            rightAnswer = String.valueOf(randomNumber1 * randomNumber2);
        }

        question = "Question: " + randomNumber1 + " " + mathOperation + " " + randomNumber2;

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
