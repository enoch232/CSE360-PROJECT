package dicegameapp;

import java.util.Random;

public class Dice {
	private Random rand;
	
	Dice(){
		rand = new Random();
	}
	
	public int randInt(int min, int max){
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
}
