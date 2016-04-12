import java.util.Random;

public class Dice {
	private Random _rand;
	
	Dice(){
		_rand = new Random();
	}
	
	public int randInt(int min, int max){
		int randomNum = _rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
}
