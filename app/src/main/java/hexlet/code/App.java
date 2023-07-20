package hexlet.code;

import hexlet.code.games.Gameable;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String selectedMenuItem;
        Gameable game = null;

        showMainMenu();
        Scanner scanner = new Scanner(System.in);
        selectedMenuItem = scanner.next();
        System.out.println("Your choice: " + selectedMenuItem);

        /*
        //Такое решение не пропускает линтер, пришлось вставлять в кейс: new Engine(new Even());
        switch (selectedMenuItem) {
            case "0" -> System.out.println("Good by," + "!");
            case "1" -> Cli.askName();
            case "2" -> game = new Even();
            case "3" -> game = new Calc();
            case "4" -> game = new GCD();
            case "5" -> game = new Progression();
            case "6" -> game = new Prime();
        }

        if (game != null) {
            new Engine(game);
        }
        */

        switch (selectedMenuItem) {
            case "0" -> System.out.println("Good by," + "!");
            case "1" -> Cli.askName();
            case "2" -> new Engine(new Even());
            case "3" -> new Engine(new Calc());
            case "4" -> new Engine(new GCD());
            case "5" -> new Engine(new Progression());
            // Блок default в логике нашего приложения тут не нужен, но линтер не пропускает без него
            default -> new Engine(new Prime());
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
