package hexlet.code.games;

public final class Calc implements Gameable {
    /*
    Private final int MAX_RANDOM_NUMBER = 50;
    Линтер ругается на такое название, но я читал, что так принято обозначать
    константы, что бы их можно было отличить от переменных.
    Подскажите как лучше именовать константы?
    */
    private final int maxRandomNumber = 50;
    private final int maxDifferentOperations = 3;
    private String question = "";
    private String rightAnswer = "";

    @Override
    public void generateNewQuestion() {

        int randomMathOperation = (int) (Math.random() * maxDifferentOperations);
        int randomNumber1 =  (int) (Math.random() * maxRandomNumber);
        int randomNumber2 =  (int) (Math.random() * maxRandomNumber);
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
        return "What is the result of the expression?";
    }

}
