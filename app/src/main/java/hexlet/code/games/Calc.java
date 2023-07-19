package hexlet.code.games;

public final class Calc implements Gameable {
    private final String gameTitle = "What is the result of the expression?";
    private final int maxRandomNumber = 50;
    private final int maxDifferentOperations = 3;
    private String question = "";
    private String rightAnswer = "";

    @Override
    public void generateNewQuestion() {
        int randomMathOperation = (int) (Math.random() * maxDifferentOperations);
        int randomNumber1 =  (int) (Math.random() * maxRandomNumber);
        int randomNumber2 =  (int) (Math.random() * maxRandomNumber);

        question =  calculateQuestion(randomNumber1, randomMathOperation, randomNumber2);
        rightAnswer = calculateRightAnswer(randomNumber1, randomMathOperation, randomNumber2);
   }

    private String calculateQuestion(int randomNumber1, int randomMathOperation, int randomNumber2) {
        String mathOperation = "";
        switch (randomMathOperation) {
            case 0 -> mathOperation = "+";
            case 1 -> mathOperation = "-";
            default -> mathOperation = "*";
        }

        return "Question: " + randomNumber1 + " " + mathOperation + " " + randomNumber2;
    }

    private String calculateRightAnswer(int randomNumber1, int randomMathOperation, int randomNumber2) {
        String rezult = "";
        switch (randomMathOperation) {
            case 0 -> rezult = String.valueOf(randomNumber1 + randomNumber2);
            case 1 -> rezult = String.valueOf(randomNumber1 - randomNumber2);
            default -> rezult = String.valueOf(randomNumber1 * randomNumber2);
        }

        return rezult;
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
