package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String userName = "";
        String selectedMenuItem;

        selectedMenuItem = showMainMenu();
        System.out.println("Your choice: " + selectedMenuItem);

        if (userName.equals("") && !selectedMenuItem.equals("0")) {
            userName = Cli.askName();
        }

        if (selectedMenuItem.equals("0")) {
            System.out.println("Good by," + userName + "!");
        } else if (selectedMenuItem.equals("2")) {
            new Engine(new Even(), userName);
        } else if (selectedMenuItem.equals("3")) {
            new Engine(new Calc(), userName);
        } else if (selectedMenuItem.equals("4")) {
            new Engine(new GCD(), userName);
        } else if (selectedMenuItem.equals("5")) {
            new Engine(new Progression(), userName);
        } else if (selectedMenuItem.equals("6")) {
            new Engine(new Prime(), userName);
        }

    }

    public static String showMainMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        return userInput;
    }

}
