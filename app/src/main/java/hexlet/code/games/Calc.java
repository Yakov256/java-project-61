package hexlet.code.games;

public final class Calc implements Gameable {
    private final String gameTitle = "What is the result of the expression?";
    private final int maxRandomNumber = 50;
    private final int maxDifferentOperations = 3;

    @Override
    public QuizQuestion getNewQuizQuestion() {
        int randomMathOperation = Utils.generateRandomNumber(maxDifferentOperations);
        int randomNumber1 = Utils.generateRandomNumber(maxRandomNumber);
        int randomNumber2 = Utils.generateRandomNumber(maxRandomNumber);

        String question =  calculateQuestion(randomNumber1, randomMathOperation, randomNumber2);
        String rightAnswer = calculateRightAnswer(randomNumber1, randomMathOperation, randomNumber2);

        return new QuizQuestion(question, rightAnswer);
   }

    private String calculateQuestion(int randomNumber1, int randomMathOperation, int randomNumber2) {
        /* Переделал на case все работает, но такое решение не пропускает линтер,
           пришлось делать через если.
        switch (randomMathOperation) {
            case 0 -> mathOperation = "+";
            case 1 -> mathOperation = "-";
            default -> mathOperation = "*";
        }
        */

        String mathOperation = "";
        if (randomMathOperation == 0) {
            mathOperation = "+";
        } else if (randomMathOperation == 1) {
            mathOperation = "-";
        } else {
            mathOperation = "*";
        }

        return "Question: " + randomNumber1 + " " + mathOperation + " " + randomNumber2;
    }

    private String calculateRightAnswer(int randomNumber1, int randomMathOperation, int randomNumber2) {
        /* Переделал на case все работает, но такое решение не пропускает линтер,
           пришлось делать через если.
        switch (randomMathOperation) {
            case 0 -> rezult = String.valueOf(randomNumber1 + randomNumber2);
            case 1 -> rezult = String.valueOf(randomNumber1 - randomNumber2);
            default -> rezult = String.valueOf(randomNumber1 * randomNumber2);
        }
        */

        String rezult = "";
        if (randomMathOperation == 0) {
            rezult = String.valueOf(randomNumber1 + randomNumber2);
        } else if (randomMathOperation == 1) {
            rezult = String.valueOf(randomNumber1 - randomNumber2);
        } else {
            rezult = String.valueOf(randomNumber1 * randomNumber2);
        }

        return rezult;
    }

    @Override
    public String getGameTitle() {
        return gameTitle;
    }

}
