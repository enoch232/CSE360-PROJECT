package dicegameapp;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class JUnitRankBoardTest {

	@Test
	public void testRankBoard() {
		RankBoard rankBoard = new RankBoard();
		assertNotNull(rankBoard);
	}

	@Test
	public void testAddNewRecord() {
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

	@Test
	public void testPrb() {
		RankBoard rb = new RankBoard();
		assertEquals(rb.prb(), "\t\tNo Record!!\n");
	}

	@Test
	public void testSize() {
		RankBoard rankBoard = new RankBoard();
		
		Vector<RankRecord> newRecord = new Vector<RankRecord>();
		rankBoard.addNewRecord(newRecord);
		
		newRecord = new Vector<RankRecord>();
		rankBoard.addNewRecord(newRecord);
		
		newRecord = new Vector<RankRecord>();
		rankBoard.addNewRecord(newRecord);
		
		newRecord = new Vector<RankRecord>();
		rankBoard.addNewRecord(newRecord);
		
		assertEquals(4, rankBoard.size());
	}

}
