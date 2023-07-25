package hexlet.code;

import hexlet.code.games.Gameable;
import hexlet.code.games.QuizQuestion;

import java.util.Scanner;

public class Engine {
    private final int maxRoundsCount = 3;
    public Engine(Gameable game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(game.getGameTitle());

        for (int i = 0; i < maxRoundsCount; i++) {
            QuizQuestion question = game.getNewQuizQuestion();
            System.out.println("Question: " + question.question());
            String userAnswer = scanner.next();

            if (userAnswer.equalsIgnoreCase(question.rightAnswer())) {
                System.out.println("Your answer: " + userAnswer);
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was  '"
                        + question.rightAnswer() + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");

    }
}
