package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void askName() {
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

    }
}
