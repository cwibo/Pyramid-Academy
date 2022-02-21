import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GuessNumberGame game = new GuessNumberGame();
        System.out.println(game.intro());
        System.out.println(game.promptUser());

        int number = game.Randnum();
        int guess = 0;

        int attempt = 0;
        do {
            guess++;
            attempt = game.getUserInput(scanner);
            if (attempt == number) {
                System.out.println(game.winner());
                System.exit(0);
            } else if (attempt > number) {
                System.out.println(game.tooHigh());
            } else if (attempt < number) {
                System.out.println(game.tooLow());
            }
        } while (guess<7);

        if (guess>=7) {
            System.out.println(game.ranOut());
        }
    }
}
