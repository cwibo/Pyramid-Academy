import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reply = "y";
        try {
            do {

                System.out.println("Hello! What is your name?");

                int num = (int) (Math.random() * 20) + 1;
                String name = input.nextLine();
                System.out.println("Well, " + name + " I'm thinking of a number between 1 and 20." +
                        "\n Take a guess.");
                int count = 0;
                int x = 0;
                while (count < 6 && x != num) {
                    x = input.nextInt();
                    if (x > num) {
                        System.out.println("Your guess is too high.");
                        count++;
                    } else if (x < num) {
                        System.out.println("Your guess is too low.");
                        count++;
                    }
                }
                if (x == num) {
                    System.out.println("Good job, " + name + ". Would you like to play again?");
                } else {
                    System.out.println("Sorry, " + name + ". The correct answer was " + num + "Would you like to play again?");
                }
                reply = input.next();
                if (reply == String.valueOf('n')) {
                    System.exit(0);
                } else {
                    reply = "y";
                }
            }
            while (reply == "y");
        }
        catch (Exception e){
            System.out.println("You have entered an invalid input. The game will now end.");
        }
    }
}
