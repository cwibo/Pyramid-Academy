import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
class DragonTest {
    Dragon dragon;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dragon = new Dragon();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void intro() {
        assertEquals("You are in a land full of dragons. In front of you," +
                "\n you see two caves. In one cave, the dragon is friendly" +
                        "\n and will share his treasure with you. The other dragon" +
                        "\n is greedy and hungry and will eat you on sight.", dragon.intro());
    }

    @Test
    void promptUser() {
        assertEquals("Which cave will you go into? (1 or 2)?", dragon.promptUser());
    }

    @Test
    void death() {
        assertEquals("You approach the cave...\n" +
                "It is dark and spooky\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!", dragon.death());
    }

    @Test
    void alive() {
        assertEquals("You approach the cave..." +
                "\n Your eyes are blinded by the brightness of all the treasure..." +
                "\n and you see the friendly dragon, who invites you to take some treasure.", dragon.alive());
    }

    @Test
    void invalidInput() {
        assertEquals("An old, powerful wizard with a long white beard appears saying, Incorrect entry. YOU SHALL NOT PASS!", dragon.invalidInput());
    }

}