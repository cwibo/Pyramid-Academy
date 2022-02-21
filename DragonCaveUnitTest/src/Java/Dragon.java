import java.util.Scanner;
public class Dragon {
    public String intro(){
        return "You are in a land full of dragons. In front of you," +
                "\n you see two caves. In one cave, the dragon is friendly" +
                "\n and will share his treasure with you. The other dragon" +
                "\n is greedy and hungry and will eat you on sight.";
    }
    public String promptUser(){
        return "Which cave will you go into? (1 or 2)?";
    }
    public String death() {
        return "You approach the cave...\n" +
                "It is dark and spooky\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!";
    }
    public String alive(){
        return "You approach the cave..." +
                "\n Your eyes are blinded by the brightness of all the treasure..." +
                "\n and you see the friendly dragon, who invites you to take some treasure.";
    }
    public String invalidInput(){
        return "An old, powerful wizard with a long white beard appears saying, Incorrect entry. YOU SHALL NOT PASS!";
    }
    public int getUserInput(Scanner scanner) {
        return scanner.nextInt();
    }
}
