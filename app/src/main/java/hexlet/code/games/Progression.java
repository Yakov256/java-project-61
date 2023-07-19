package hexlet.code.games;

public final class Progression implements Gameable {
    private final String gameTitle = "What number is missing in the progression?";
    private final int maxProgressionStep = 9;
    private final int maxSequenceLength = 5;
    private final int maxStartNumber = 25;
    private String question = "";
    private String rightAnswer = "";

    @Override
    public void generateNewQuestion() {

        int stepValue = 1 + (int) (Math.random() * maxProgressionStep);
        int sequenceLength = maxSequenceLength + (int) (Math.random() * maxSequenceLength);
        int startNumber = 1 + (int) (Math.random() * maxStartNumber);
        int hiddenNumber = 1 + (int) (Math.random() * (sequenceLength - 1));

        rightAnswer = calculateRightAnswer(startNumber, stepValue, hiddenNumber);
        question = calculateQuestion(startNumber, stepValue, sequenceLength, hiddenNumber);
        System.out.println("111");
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
    public QuizQuestion getQuizQuestion() {
        return new QuizQuestion(question, rightAnswer);
    }

    @Override
    public String getGameTitle() {
        return gameTitle;
    }
}
