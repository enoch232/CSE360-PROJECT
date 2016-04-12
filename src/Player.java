
public class Player {
	private String name;
	private int balance;
	private int points;
	private boolean isPass;
	private Dice dice;
	
	private void initialize(String newName, int newBalance){
		name = newName;
		balance = newBalance;
		points = 0;
		isPass = false;
		dice = new Dice();
	}
	
	Player(String newName, int newBalance){
		initialize(newName, newBalance);
	}
	
	Player(String newName){
		initialize(newName, 1000);
	}
	
	public int checkBalance(){
		return balance;
	}
	
	public int getCurPoints(){
		return points;
	}
	
	public String getPlayerName(){
		return name;
	}
	
	public int rollDice(){
		int val = dice.randInt(1, 6);
		return val;
	}
	
	public void pass(){
		isPass = true;
	}
	
	public boolean checkPass(){
		return isPass;
	}
	
	public void createNewRound(){
		points = 0;
		isPass = false;
	}
}

