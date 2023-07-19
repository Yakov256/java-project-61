package hexlet.code;

import hexlet.code.games.Gameable;
import hexlet.code.games.QuizQuestion;

import java.util.Scanner;

public class Engine {
    /*
    Private final int MAX_ROUNDS_COUNT = 50;
    Линтер ругается на такое название, но я читал, что так принято обозначать
    константы, что бы их можно было отличить от переменных.
    Подскажите как лучше именовать константы?
    */
    private final int maxRoundsCount = 3;
    public Engine(Gameable game) {
        int correctAnswerCount = 0;
        Scanner scanner = new Scanner(System.in);

        String userName = Cli.askName();
        System.out.println(game.getGameTitle());

        //while (!gameOver && correctAnswerCount < maxRoundsCount) {
        for (int i = 0; i < maxRoundsCount; i++) {
            game.generateNewQuestion();
            QuizQuestion question = game.getQuizQuestion();
            System.out.println(question.getQuestion());
            String userAnswer = scanner.next();

            if (userAnswer.equalsIgnoreCase(question.getRightAnswer())) {
                System.out.println("Your answer: " + userAnswer);
                System.out.println("Correct!");
                correctAnswerCount++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was  '"
                        + question.getRightAnswer() + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (correctAnswerCount >= maxRoundsCount) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }

}
