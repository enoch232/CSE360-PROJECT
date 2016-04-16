import static org.junit.Assert.*;
import org.junit.Test;


public class JUnitAdminTest {

	@Test
	/*Check if the target is set to default value of 13.
	 * 
	 */
	public void testAdminTarget() {
		Admin administrator = new Admin();
		assertEquals(13, administrator.getTarget());

	}
	

}
