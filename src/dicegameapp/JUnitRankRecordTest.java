import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitRankRecordTest {

	@Test
	// Test if we can create the RankRecord Object
	public void testCreateObject() {
		RankRecord rankRecord = new RankRecord();
		assertNotNull("rankRecord is Null", rankRecord);
	}
	
	@Test
	// Test setWinnerName method
	public void testSetWinnerName(){
		RankRecord rankRecord = new RankRecord();
		rankRecord.setWinnerName("Zeyu Zhang");
		assertEquals("Zeyu Zhang", rankRecord.getWinnerName());
	}
	
	@Test
	// Test setWinnerScore method
	public void testSetWinnerScore(){
		RankRecord rankRecord = new RankRecord();
		rankRecord.setWinnerScore(123);
		assertEquals(123, rankRecord.getWinnerScore());
	}
	
	@Test
	// Test isTie() method
	public void testIsTie(){
		RankRecord rankRecord = new RankRecord();
		assertEquals(false, rankRecord.isTie());
		rankRecord.setTie();
		assertEquals(true, rankRecord.isTie());
	}
}
