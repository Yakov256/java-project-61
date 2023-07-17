package hexlet.code.games;

public final class Progression implements Gameable {
    private String question = "";
    private String rightAnswer = "";
    private final int maxProgressionStep = 9;
    private final int maxSequenceLength = 5;
    private final int maxStartNumber = 25;

    @Override
    public void generateNewQuestion() {

        int stepValue = 1 + (int) (Math.random() * maxProgressionStep);
        int sequenceLength = maxSequenceLength + (int) (Math.random() * maxSequenceLength);
        int startNumber = 1 + (int) (Math.random() * maxStartNumber);
        int hiddenNumber = 1 + (int) (Math.random() * (sequenceLength - 1));
        StringBuilder questionStr = new StringBuilder("Question:");

        for (int i = 0; i < sequenceLength; i++) {
            if (i != hiddenNumber) {
                questionStr.append(" " + (startNumber + stepValue * i));
            } else {
                questionStr.append(" ..");
                rightAnswer = String.valueOf(startNumber + stepValue * i);
            }
        }

        question = questionStr.toString();
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
        return "What number is missing in the progression?";
    }
}
