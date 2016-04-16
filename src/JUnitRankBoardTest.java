import static org.junit.Assert.*;
import java.util.Vector;

import org.junit.Test;

public class JUnitRankBoardTest {

	@Test
	// Test if we can create the new object successfully
	public void testCreateNewObject() {
		RankBoard rankBoard = new RankBoard();
		assertNotNull(rankBoard);
	}
	
	@Test
	// Test if the addNewRecord() method works approriately
	public void testAddNewRecord(){
		RankBoard rankBoard = new RankBoard();
		
		Vector<RankRecord> newRecord = new Vector<RankRecord>();
		rankBoard.addNewRecord(newRecord);
		
		newRecord = new Vector<RankRecord>();
		rankBoard.addNewRecord(newRecord);
		
		newRecord = new Vector<RankRecord>();
		rankBoard.addNewRecord(newRecord);
		
		newRecord = new Vector<RankRecord>();
		rankBoard.addNewRecord(newRecord);
		
		newRecord = new Vector<RankRecord>();
		rankBoard.addNewRecord(newRecord);
		
		assertEquals(5, rankBoard.size());
	}

}
