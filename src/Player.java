
public class Player {
	private String userName;
	private int balance;
	private int points;
	private boolean isPass;
	private Dice dice;
	
	private void initialize(String newName, int newBalance){
		userName = newName;
		balance = newBalance;
		points = 0;
		isPass = false;
		dice = new Dice();
	}
	
	Player(String newName, int newBalance){
		initialize(newName, newBalance);
	}
	
	Player(String newName){
		initialize(newName, 100);
	}
	
	Player(){
		initialize("", 100);
	}
	
	public void setPlayerName(String newName){
		userName = newName;
	}
	
	public void setBalance(int newBalance){
		balance = newBalance;
	}
	
	public void addPoints(int val){
		points += val;
	}
	
	public void createNewRound(){
		points = 0;
		isPass = false;
	}
	
	public void pass(){
		isPass = true;
	}
	
	public int rollDice(){
		int val = dice.randInt(1, 6);
		return val;
	}
	
	public void printInfo(){
		System.out.printf("Username:\t\t%s\n", userName);
		System.out.printf("Balance:\t\t%d\n", balance);
		System.out.printf("Points:\t\t%d\n", points);
	}
	
	public int checkBalance(){
		return balance;
	}
	
	public int getCurPoints(){
		return points;
	}
	
	public String getPlayerName(){
		return userName;
	}
	
	public boolean checkPass(){
		return isPass;
	}
}
