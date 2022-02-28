import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void playGame() {
        String wordTest = "";
        Scanner testInput = new Scanner(System.in);
        assertNotNull(Main.playGame(wordTest, testInput), "Should be true or false");
    }

    @Test
    void handleGuess() {
        Scanner testIn = new Scanner(System.in);
        ArrayList<Character> testArr = new ArrayList<>();
        assertEquals("String", Main.handleGuess(testIn,testArr), "Should return string");
    }

    @AfterEach
    void tearDown() {
    }
}