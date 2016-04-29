package dicegameapp;

import dicegameapp.Dice;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Player extends Admin{
	private String userName;
	private int balance;
	private int score; 		// change to curScore
	private int bet;
	private boolean isPass;
	private boolean isLose;
	static private Dice dice = new Dice();
	
	private void initialize(String newName, int newBalance){
		userName = newName;
		balance = newBalance;
		score = 0;
		isPass = false;
		isLose = false;
                
                if(balance >= 10)
                    bet = 10;
                else
                    bet = balance;
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
                if(balance >= 10)
                    bet = 10;
                else
                    bet = balance;
	}
	
	public void setTargetScore(int newTarget){
		target = newTarget;
	}
	
	public void addScore(int val){
		score += val;
	}
	
	public void reset(){
		score = 0;
		isPass = false;
		isLose = false;
                if(balance >= 10)
                    bet = 10;
                else
                    bet = balance;
	}
	
	public void pass(){
		isPass = true;
	}
	
	public int rollDice(){
                int val = dice.randInt(1, 6);
		score += val;
		
		if(score > target){
			isLose = true;
			isPass = true;
		}
		
		return val;
	}
	
	public void printInfo(){
		System.out.printf("===========================================\n");
		System.out.printf("\t\tUsername: %s\n", userName);
		System.out.printf("\t\tBalance:  %d\n", balance);
		System.out.printf("\t\tScore:   %d\n", score);
                System.out.printf("\t\tBet:   %d\n", bet);
		System.out.printf("===========================================\n");
	}
	
	public void checkRanking(){
		System.out.printf("Hi %s, Your current ranking is ...\n", userName);
	}
	
	public void checkBalance(){
		System.out.printf("Hi %s, Your current balance is %d\n", userName, balance);
	}
	
	public void checkCurScore(){
		System.out.printf("Hi %s, Your current score is %d\n", userName, score);
	}
	
	public int getCurScore(){
		return score;
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
	
	public void grading(int heighestScore){
		if(heighestScore != -1){
			if(score == heighestScore){
                            balance += bet;
                            System.out.printf("Bet = %d\n", bet);
                        }
				
			else
				balance -= bet;
		}
	}
	
	public void delete(){
		balance = 0;
	}
        
        public void doubleBet(){
            if(bet * 2 > balance){
    		JOptionPane.showMessageDialog(null, "Not Enough To Bet");
            }
            else{
                bet *= 2;
            }
        }
}
