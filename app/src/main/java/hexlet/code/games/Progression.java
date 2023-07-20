package hexlet.code.games;

public final class Progression implements Gameable {
    private final String gameTitle = "What number is missing in the progression?";
    private final int maxProgressionStep = 9;
    private final int maxSequenceLength = 8;
    private final int maxStartNumber = 25;

    @Override
    public QuizQuestion getNewQuizQuestion() {
        int stepValue = Utils.generateRandomNumber(1, maxProgressionStep);
        int sequenceLength = maxSequenceLength / 2 + Utils.generateRandomNumber(maxSequenceLength / 2);
        int startNumber = Utils.generateRandomNumber(1, maxStartNumber);
        int hiddenNumber = Utils.generateRandomNumber(1, sequenceLength - 1);

        String rightAnswer = calculateRightAnswer(startNumber, stepValue, hiddenNumber);
        String question = calculateQuestion(startNumber, stepValue, sequenceLength, hiddenNumber);

        return new QuizQuestion(question, rightAnswer);
    }

    private String calculateQuestion(int startNumber, int stepValue, int sequenceLength, int hiddenNumber) {
        StringBuilder questionStr = new StringBuilder("Question:");
        for (int i = 0; i < sequenceLength; i++) {
            if (i != hiddenNumber) {
                questionStr.append(" " + (startNumber + stepValue * i));
            } else {
                questionStr.append(" ..");
            }
        }
        return questionStr.toString();
    }

    private String calculateRightAnswer(int startNumber, int stepValue, int hiddenNumber) {
        return String.valueOf(startNumber + stepValue * hiddenNumber);
    }

    @Override
    public String getGameTitle() {
        return gameTitle;
    }
}
