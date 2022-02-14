import java.util.Scanner;
public class DragonCave {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you," +
                "\n you see two caves. In one cave, the dragon is friendly" +
                "\n and will share his treasure with you. The other dragon" +
                "\n is greedy and hungry and will eat you on sight." +
                "\n Which cave will you go into? (1 or 2)");
        try {
            int user = input.nextInt();
            if (user == 1) {
                System.out.println("You approach the cave..." +
                        "\n It is dark and spooky..." +
                        "\n A large dragon jumps out in front of you! He opens his jaws and..." +
                        "\n Gobbles you down in one bite!");
                System.exit(0);
            } else if (user == 2) {
                System.out.println("You approach the cave..." +
                        "\n Your eyes are blinded by the brightness of all the treasure..." +
                        "\n and you see the friendly dragon, who invites you to take some treasure.");
                System.exit(0);

            } else {
                System.out.println("An old, powerful wizard with a long white beard appears saying, Incorrect entry. YOU SHALL NOT PASS!");
                System.exit(0);
            }
        }
        catch(Exception e){
            System.out.println("You have entered an invalid input. The game will now end.");
        }
    }
}
