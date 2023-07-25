package hexlet.code.games;

import hexlet.code.Utils;

public final class Calc implements Gameable {
    private final String gameTitle = "What is the result of the expression?";
    private final int maxRandomNumber = 50;
    private final int maxDifferentOperations = 2;

    @Override
    public QuizQuestion getNewQuizQuestion() {
        String[] mathOperation = new String[] {"+", "-", "*"};
        int randomMathOperation = Utils.generateRandomNumber(maxDifferentOperations);
        int randomNumber1 = Utils.generateRandomNumber(maxRandomNumber);
        int randomNumber2 = Utils.generateRandomNumber(maxRandomNumber);

        String question = randomNumber1 + " " + mathOperation[randomMathOperation] + " " + randomNumber2;
        String rightAnswer = calculateMathematicalExpression(randomNumber1, randomMathOperation, randomNumber2);

        return new QuizQuestion(question, rightAnswer);
   }

    private String calculateMathematicalExpression(int randomNumber1, int randomMathOperation, int randomNumber2) {
        return switch (randomMathOperation) {
            case 0 -> String.valueOf(randomNumber1 + randomNumber2);
            case 1 -> String.valueOf(randomNumber1 - randomNumber2);
            case 2 -> String.valueOf(randomNumber1 * randomNumber2);
            default -> throw new IllegalArgumentException();
        };
    }

    @Override
    public String getGameTitle() {
        return gameTitle;
    }
}
