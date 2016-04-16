import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class JUnitPlayerTester {
	String name = "player";
	int balance = 100;
	int target = 8;
	int score = 10;

	@Test
	public void testPlayer() {
		Player p1 = new Player();
		Player p2 = new Player(name);
		Player p3 = new Player(name, balance);
		
		assertNotNull("The Player1 is NULL", p1);
		assertNotNull("The Player2 is NULL", p2);
		assertNotNull("The Player3 is NULL", p3);
	}

	@Test
	public void testSetPlayerName() {
		Player p1 = new Player();
		p1.setPlayerName(name);
		assertEquals(p1.getPlayerName(), name);
	}

	@Test
	public void testSetBalance() {
		Player p1 = new Player();
		p1.setBalance(1000);
		assertEquals(p1.getBalance(), 1000);
	}

	@Test
	public void testSetTargetScore() {
		Player p1 = new Player();
		p1.setTargetScore(target);
		assertEquals(p1.getTarget(), target);
	}

	@Test
	public void testAddScore() {
		Player p1 = new Player();
		p1.addScore(score);
		assertEquals(p1.getCurScore(), score);
	}

	@Test
	public void testReset() {
		Player p1 = new Player();
		p1.addScore(score);
		p1.reset();
		assertEquals(p1.getCurScore(), 0);
		assertEquals(p1.isPass(), false);
		
	}

	@Test
	public void testPass() {
		Player p1 = new Player();
		p1.reset();
		p1.pass();
		assertEquals(p1.isPass(), true);
	}

	@Test
	public void testCheckRanking() {
		Player p3 = new Player(name, balance);
		String output;
		String temp = "Hi " + name + ", Your current ranking is ...\n";
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(result);
		PrintStream previous = System.out;
		System.setOut(ps);
		p3.checkRanking();
		System.out.flush();
		System.setOut(previous);
		output = result.toString();
		
		assertEquals(output, temp);
	}

	@Test
	public void testCheckBalance() {
		Player p3 = new Player(name, balance);
		String output;
		String temp = "Hi " + name + ", Your current balance is " + balance + "\n";
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(result);
		PrintStream previous = System.out;
		System.setOut(ps);
		p3.checkBalance();
		System.out.flush();
		System.setOut(previous);
		output = result.toString();
		//System.out.println(output);
		assertEquals(output, temp);
	}

	@Test
	public void testCheckCurScore() {
		Player p3 = new Player(name, balance);
		String output;
		int sc = 5;
		p3.addScore(sc);
		String temp = "Hi " + name + ", Your current score is " + sc + "\n";
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(result);
		PrintStream previous = System.out;
		System.setOut(ps);
		p3.checkCurScore();
		System.out.flush();
		System.setOut(previous);
		output = result.toString();
		assertEquals(output, temp);
	}

	@Test
	public void testGetCurScore() {
		Player p1 = new Player();
		assertEquals(p1.getCurScore(), 0);
	}

	@Test
	public void testGetBalance() {
		Player p3 = new Player(name, balance);
		assertEquals(p3.getBalance(), balance);
	}

	@Test
	public void testGetPlayerName() {
		Player p3 = new Player(name, balance);
		assertEquals(p3.getPlayerName(), name);
	}

	@Test
	public void testIsPass() {
		Player p1 = new Player();
		assertEquals(p1.isPass(), false);
		p1.pass();
		assertEquals(p1.isPass(), true);
	}

	@Test
	public void testIsLose() {
		Player p1 = new Player();
		assertEquals(p1.isLose(), false);
	}

	@Test
	public void testGrading() {
		Player p3 = new Player(name, balance);
		p3.grading(100);
		p3.addScore(5);
		assertEquals(p3.getCurScore(), 5);
		assertEquals(p3.getBalance(), 90);
	}

}
