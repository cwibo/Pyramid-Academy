import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberGameTest {

    GuessNumberGame random;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        random = new GuessNumberGame();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void intro() {
        assertEquals("Hello and welcome to the Number Game! I am thinking of a number between 1 and 20.", random.intro());
    }

    @Test
    void promptUser() {
        assertEquals("Take a guess.", random.promptUser());
    }

    @Test
    void winner() {
        assertEquals("Good job! You guessed my number.", random.winner());
    }

    @Test
    void ranOut() {
        assertEquals("You've used all your attempts.", random.ranOut());
    }

    @Test
    void tooHigh() {
        assertEquals("Too high", random.tooHigh());
    }

    @Test
    void tooLow() {
        assertEquals("Too low", random.tooLow());
    }
}