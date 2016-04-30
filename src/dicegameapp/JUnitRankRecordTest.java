package dicegameapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitRankRecordTest {

	@Test
	public void testRankRecord() {
		RankRecord rankRecord = new RankRecord();
		assertNotNull("rankRecord is Null", rankRecord);
	}

	@Test
	public void testSetWinnerName() {
		RankRecord rankRecord = new RankRecord();
		rankRecord.setWinnerName("Player1");
		assertEquals("Player1", rankRecord.getWinnerName());
	}

	@Test
	public void testSetWinnerScore() {
		RankRecord rankRecord = new RankRecord();
		rankRecord.setWinnerScore(123);
		assertEquals(123, rankRecord.getWinnerScore());
	}

	@Test
	public void testSetTie() {
		RankRecord rankRecord = new RankRecord();
		assertEquals(false, rankRecord.isTie());
		rankRecord.setTie();
		assertEquals(true, rankRecord.isTie());
	}

	@Test
	public void testGetWinnerName() {
		RankRecord rankRecord = new RankRecord();
		rankRecord.setWinnerName("Player3");
		assertEquals("Player3", rankRecord.getWinnerName());
	}

	@Test
	public void testGetWinnerScore() {
		RankRecord rankRecord = new RankRecord();
		rankRecord.setWinnerName("Player9");
		assertEquals("Player9", rankRecord.getWinnerName());
	}

	@Test
	public void testIsTie() {
		RankRecord rankRecord = new RankRecord();
		assertEquals(rankRecord.isTie(), false);
	}

}
