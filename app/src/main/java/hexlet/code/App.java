package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String userName = "User";
        int selectedMenuItem = -255;

        //System.out.println("Welcome to the Brain Games!");

        while (selectedMenuItem != 0) {
            selectedMenuItem = mainMenu();
            System.out.println("Your choice: " + selectedMenuItem);

            if (selectedMenuItem == 0) {
                System.out.println("Good by," + userName + "!");

            } else if (selectedMenuItem == 1) {
                userName = Cli.askName();
            } else if (selectedMenuItem == 2) {
                new Even(userName);
                System.out.println();
            }

        }

    }

    public static int mainMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet ");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Необходимо ввести число!");
        }
        return -255;
    }

}
