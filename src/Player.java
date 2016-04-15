
public class Player extends Admin{
	private String userName;
	private int balance;
	private int points;
	private boolean isPass;
	private boolean isLose;
	static private Dice dice = new Dice();
	
	private void initialize(String newName, int newBalance){
		userName = newName;
		balance = newBalance;
		points = 0;
		isPass = false;
		isLose = false;
		// dice = new Dice();
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
	
	public void setTargetPoints(int newTarget){
		target = newTarget;
	}
	
	public void addPoints(int val){
		points += val;
	}
	
	public void reset(){
		points = 0;
		isPass = false;
		isLose = false;
	}
	
	public void pass(){
		isPass = true;
	}
	
	public int rollDice(){
		if( isPass ){
			System.out.printf("Sorry, you cannot roll the dice! Since you "
					+ "already pass this round in previous actions.\n");
			return -1;
		}
		
		int val = dice.randInt(1, 6);
		System.out.printf("You got %d !!!\n", val);
		points += val;
		System.out.printf("Your current points is %d\n", points);
		
		if(points > target){
			isLose = true;
			isPass = true;
			System.out.printf("Oh NO!!! Busted!!!\n");
		}
		
		return val;
	}
	
	public void printInfo(){
		System.out.printf("===========================================\n");
		System.out.printf("\t\tUsername: %s\n", userName);
		System.out.printf("\t\tBalance:  %d\n", balance);
		System.out.printf("\t\tPoints:   %d\n", points);
		System.out.printf("===========================================\n");
	}
	
	public void checkRanking(){
		System.out.printf("Hi %s, Your current ranking is ...\n", userName);
	}
	
	public void checkBalance(){
		System.out.printf("Hi %s, Your current balance is %d\n", userName, balance);
	}
	
	public void checkCurPoints(){
		System.out.printf("Hi %s, Your current points is %d\n", userName, points);
	}
	
	public int getCurPoints(){
		return points;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public String getPlayerName(){
		return userName;
	}
	
	public boolean isPass(){
		return isPass;
	}
	
	public boolean isLose(){
		return isLose;
	}
}
