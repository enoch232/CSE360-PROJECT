import java.util.Scanner;
import java.util.Vector;

public class DiceGame {
    private int numOfPlayers;
    private Player[] playerArr;
    private Admin admin;
    private RankBoard rankBoard;
    
    private final int CHECK_RANKING = 0;
    private final int CHECK_CUR_POINTS = 1;
    private final int CHECK_BALANCE = 2;
    private final int PASS = 3;
    private final int ROLL_DICE = 4;
    
    DiceGame(){
        admin = new Admin();
        rankBoard = new RankBoard();
    }
    
    private void clearScreen(){
        for(int i = 0; i < 10; i++)
            System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    private boolean checkRoundStatus(){
    	boolean isDone = true;
    	
    	for(int i = 0; i < numOfPlayers && isDone; i++){
    		if(playerArr[i].isPass() == false){
    			isDone = false;
    		}
    	}
    	
    	return isDone;
    }
    
    private boolean checkGameStatus(){
        return false;
    }
    
    private void playerActions(Player player){
        boolean isDone = false;
        int res = -1;
        Scanner in = new Scanner(System.in);
        // System.out.printf("I am Here 1\n");
        
        while( !isDone ){
            clearScreen();
            player.printInfo();
            
            System.out.printf("Hey, %s\n", player.getPlayerName());
            System.out.printf("Make your choice!!!\n");
            System.out.printf("0. Check Ranking Board\n");
            System.out.printf("1. Check Current Points.\n");
            System.out.printf("2. Check Current Balance.\n");
            System.out.printf("3. PASS\n");
            if( !player.isPass() ){
                System.out.printf("4. Roll Dice.\n");
                System.out.printf("Please enter your option <0 - 4>: ");
            }
            else
            	System.out.printf("Please enter your option <0 - 3>: ");
            
            res = in.nextInt();
            
            in.nextLine();  // Dump the character '\n'
            
            switch(res){
                case CHECK_RANKING:
                    // player.checkRanking();
                	rankBoard.printRankBoard();
                    break;
                case CHECK_CUR_POINTS:
                    player.checkCurPoints();
                    break;
                case CHECK_BALANCE:
                    player.checkBalance();
                    break;
                case PASS:
                    player.pass();
                    isDone = true;
                    break;
                case ROLL_DICE:
                	if( player.isPass() || player.isLose() ){
                		System.out.printf("Sorry, you cannot roll the dice "
                				+ "since you already pass the game or you are "
                				+ "busted!\n");
                		System.out.printf("Please choose another option.\n");
                	}
                	else{
                		player.rollDice();
                        isDone = true;
                	}
                    break;
                default:
                    System.out.printf("Sorry, we do not have this option, please try again.\n");
                    break;
            }
            enterContinue();
        }
    }
    
    private void newRound(){
        boolean isOver = false;
        
        for(int i = 0; i < numOfPlayers; i++){
            playerArr[i].reset();
        }
        
        while( !isOver ){
        	// System.out.printf("I am Here 2\n");
            for(int i = 0; i < numOfPlayers; i++){
            	// if(playerArr == null){
            	// 	System.out.printf("playerArr is null\n");
            	// }
            	// if(playerArr[i] == null){
            	// 	System.out.printf("playerArr[i] is null\n");
            	// }
            	// System.out.printf("I am Here 3\n");
                playerActions(playerArr[i]);
            }
            isOver = checkRoundStatus();
        }
    }
    
    private void enterContinue(){
    	Scanner in = new Scanner(System.in);
    	System.out.printf("<Press Enter Continue>\n");
        in.nextLine();
    }
    
    private int getHeightestPoints(){
        int heighestPoints = -1;
        
        for(int i = 0; i < numOfPlayers; i++){
            if(playerArr[i].isLose() == false && playerArr[i].getCurPoints() > heighestPoints){
                heighestPoints = playerArr[i].getCurPoints();
            }
        }
        
        return heighestPoints;
    }
    
    private void gradeCurRound(){
        int heighestPoints = getHeightestPoints();
        
        for(int i = 0; i < numOfPlayers; i++)
            playerArr[i].grading(heighestPoints);
    }
    
    private Vector<RankRecord> generateRecord(){
    	Vector<RankRecord> recordList = new Vector<RankRecord>();
        RankRecord record = new RankRecord();
        int heighestPoints = getHeightestPoints();
        
        if(heighestPoints != -1){
            for(int i = 0; i < numOfPlayers; i++){
                if(playerArr[i].getCurPoints() == heighestPoints){
                    record.setWinnerName(playerArr[i].getPlayerName());
                    record.setWinnerPoints(playerArr[i].getCurPoints());
                    recordList.add(record);
                    record = new RankRecord();
                }
            }
        }
        else{
            record.setTie();
            recordList.add(record);
        }
        
    	return recordList;
    }
    
    public void runGame(){
        admin.initTargetPoints();
        playerArr = admin.startNewGame();
        numOfPlayers = playerArr.length;
        
        boolean isGameOver = false;
        int heighestPoints;
        
        while( !isGameOver ){
        	newRound();
        	
            gradeCurRound();
        	rankBoard.addNewRecord(generateRecord());
        	clearScreen();
            rankBoard.printLatestRecord();
            enterContinue();
            
            isGameOver = checkGameStatus();
        }
        clearScreen();
        System.out.printf("==============Game Over==============\n");
    }
}
