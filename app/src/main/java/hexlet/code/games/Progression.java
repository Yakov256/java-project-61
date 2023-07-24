package hexlet.code.games;

import hexlet.code.Utils;

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

        int[] progression = getProgression(startNumber, stepValue, sequenceLength);

        StringBuilder questionStr = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i != hiddenNumber) {
                questionStr.append(" " + progression[i]);
            } else {
                questionStr.append(" ..");
            }
        }

        String question = questionStr.toString();
        String rightAnswer = String.valueOf(progression[hiddenNumber]);

        return new QuizQuestion(question, rightAnswer);
    }

    private int[] getProgression(int startNumber, int stepValue, int sequenceLength) {
        int[] progression = new int[sequenceLength];

        for (int i = 0; i < sequenceLength; i++) {
            progression[i] = startNumber + stepValue * i;
        }

        return progression;
    }

    @Override
    public String getGameTitle() {
        return gameTitle;
    }
}
