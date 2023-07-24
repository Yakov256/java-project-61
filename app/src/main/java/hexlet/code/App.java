package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        String selectedMenuItem;

        showMainMenu();
        Scanner scanner = new Scanner(System.in);
        selectedMenuItem = scanner.next();
        System.out.println("Your choice: " + selectedMenuItem);

        switch (selectedMenuItem) {
            case "0" -> System.out.println("Good by," + "!");
            case "1" -> Cli.askName();
            case "2" -> new Engine(new Even());
            case "3" -> new Engine(new Calc());
            case "4" -> new Engine(new GCD());
            case "5" -> new Engine(new Progression());
            case "6" -> new Engine(new Prime());
            default -> throw new IOException("invalid user input");
        }

    }

    public static void showMainMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }

}
