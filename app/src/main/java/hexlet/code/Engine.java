package hexlet.code;

import hexlet.code.games.Gameable;
import java.util.Scanner;

public class Engine {
    /*
    Private final int MAX_ROUNDS_COUNT = 50;
    Линтер ругается на такое название, но я читал, что так принято обозначать
    константы, что бы их можно было отличить от переменных.
    Подскажите как лучше именовать константы?
    */
    private final int maxRoundsCount = 3;
    public Engine(Gameable game, String userName) {
        int correctAnswerCount = 0;
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println(game.getGameTitle());

        while (!gameOver && correctAnswerCount < maxRoundsCount) {
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

        if (correctAnswerCount >= maxRoundsCount) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }

}
