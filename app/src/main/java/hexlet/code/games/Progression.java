package hexlet.code.games;

public class Progression implements Gameable {
    private String question = "";
    private String rightAnswer = "";

    @Override
    public void generateNewQuestion() {

        int stepValue = 1 + (int) (Math.random() * 8);
        int sequenceLength = 5 + (int) (Math.random() * 5);
        int startNumber = 1 + (int) (Math.random() * 15);
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
        return "What is the result of the expression?";
    }
}
