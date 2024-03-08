import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTester {

    @Test
    public void testGetMinNumber() {
        Game game = new Game();
        assertEquals(1, game.getMinNumber());
    }
    @Test
    public void testGetMaxNumber() {
        Game game = new Game();
        assertEquals(100, game.getMaxNumber());
    }
    @Test
    public void testGetAttempts() {
        Game game = new Game();
        assertEquals(0, game.getAttempts());
        game.guess(game.getNumber());
        assertEquals(1, game.getAttempts());
    }
    @Test
    public void testIsOver() {
        Game game = new Game();
        assertFalse(game.isOver());
        game.guess(game.getNumber());
        assertTrue(game.isOver());
    }
}
