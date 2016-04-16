import static org.junit.Assert.*;
import org.junit.Test;


public class JUnitDiceTester {
	@Test
	/*Check if the random dice works. (if it returns value 1-6)
	 * 
	 */
	public void testDice() {
		Dice dice = new Dice();
		assertTrue(dice.randInt(1, 6) >= 1);
		assertTrue(dice.randInt(1, 6) <= 6);
	}

	

}
