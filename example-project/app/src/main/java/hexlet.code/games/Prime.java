package hexlet.code.games;
import java.util.Scanner;

public class Prime {

    public static void game6() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        String ask = "yes";

        for (int q = 1; q <= 3; q++) {
            int value = (int) (Math.random() * 100);
            if (((value % 2 != 0) && (value > 2)) || (value == 2)) {
                for (int i = 3; i < value; i += 2) {
                    if (value % i == 0) {
                        ask = "no";
                        break;
                    }
                }
            } else {
                ask = "no";
            }
            System.out.println("Question " + q + ": " + value);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next();

            if (hexlet.code.Engine.wrong(ask, userAnswer)) {
                break;
            }

        }
    }
}