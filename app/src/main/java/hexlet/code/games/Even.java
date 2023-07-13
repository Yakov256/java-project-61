package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public Even(String userNikName) {
        int correctAnswerCount = 0;
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (!gameOver && correctAnswerCount < 3) {
            int randomNumber = (int) (Math.random() * 1000);
            System.out.println("Question: " + randomNumber);
            String userAnswer = scanner.next();

            boolean userAnswerBoolean = false;
            if (userAnswer.toLowerCase().equals("yes")) {
                userAnswerBoolean = true;
            } else if (userAnswer.toLowerCase().equals("no")) {
                userAnswerBoolean = false;
            } else {
                gameOver = true;
            }

            boolean isEven = (randomNumber % 2) == 0;
            if (isEven == userAnswerBoolean && !gameOver) {
                System.out.println("Correct!");
                correctAnswerCount++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was  '"
                        + ((isEven) ? "Yes" : "No") + "'.");
                System.out.println("Let's try again, " + userNikName + "!");
                gameOver = true;
            }
        }

        if (correctAnswerCount > 2) {
            System.out.println("Congratulations, " + userNikName + "!");
        } else {
            System.out.println();
        }
    }

}
