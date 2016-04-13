import java.util.Scanner;

public class DiceGame {
    private int numOfPlayers;
    private Player[] playerArr;
    private Admin admin;
    
    private final int CHECK_RANKING = 0;
    private final int CHECK_CUR_POINTS = 1;
    private final int CHECK_BALANCE = 2;
    private final int PASS = 3;
    private final int ROLL_DICE = 4;
    
    DiceGame(){
        admin = new Admin();
    }
    
    private void clearScreen(){
        for(int i = 0; i < 10; i++)
            System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    private void playerActions(Player player){
        boolean isDone = false;
        int res = -1;
        Scanner in = new Scanner(System.in);
        
        while( !isDone ){
            clearScreen();
            player.printInfo();
            
            System.out.printf("Hey, %s\n");
            System.out.printf("Make your choice!!!\n");
            System.out.printf("0. Check Ranking Board\n");
            System.out.printf("1. Check Current Points.\n");
            System.out.printf("2. Check Current Balance.\n");
            System.out.printf("3. PASS\n");
            if( !player.checkPass() ){
                System.out.printf("4. Roll Dice.\n");
                System.out.printf("Please enter your option <0 - 4>: ");
            }
            System.out.printf("Please enter your option <0 - 3>: ");
            res = in.nextInt();
            
            in.nextLine();  // Dump the character '\n'
            
            switch(res){
                case 0:
                    player.checkRanking();
                    break;
                case 1:
                    player.checkCurPoints();
                    break;
                case 2:
                    player.checkBalance();
                    break;
                case 3:
                    player.pass();
                    isDone = true;
                    break;
                case 4:
                    player.rollDice();
                    isDone = true;
                    break;
                default:
                    System.out.printf("Sorry, we do not have this option, please try again.\n");
                    System.out.printf("<Press Enter Continue>\n");
                    in.nextLine();
                    break;
            }
        }
    }
    
    public void runGame(){
        boolean isGameOver = false;
        
        numOfPlayers = admin.startNewGame(playerArr);
        
        while( !isGameOver ){
            for(int i = 0; i < numOfPlayers; i++){
                playerActions(playerArr[i]);
            }
        }
    }
}
