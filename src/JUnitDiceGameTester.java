import static org.junit.Assert.*;
import org.junit.Test;


public class JUnitDiceGameTester {

	@Test
	/*Create game 
	 * 
	 */
	public void testCreate() {
		DiceGame game = new DiceGame();
		assertNotEquals(null, game);
	}
}