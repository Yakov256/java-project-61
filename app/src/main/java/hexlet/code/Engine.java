package hexlet.code;

import hexlet.code.games.Gameable;
import java.util.Scanner;

public class Engine {
    private final int MAX_ROUNDS_COUNT = 3;
    public Engine(Gameable game, String userName) {
        int correctAnswerCount = 0;
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println(game.getGameTitle());

        while (!gameOver && correctAnswerCount < MAX_ROUNDS_COUNT) {
            game.generateNewQuestion();
            System.out.println(game.getQuestion());
            String userAnswer = scanner.next();

            if (userAnswer.equalsIgnoreCase(game.getRightAnswer())) {
                System.out.println("Your answer: " + userAnswer);
                System.out.println("Correct!");
                correctAnswerCount++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was  '"
                        + game.getRightAnswer() + "'.");
                System.out.println("Let's try again, " + userName + "!");
                gameOver = true;
            }
        }

        if (correctAnswerCount >= MAX_ROUNDS_COUNT) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }

}
