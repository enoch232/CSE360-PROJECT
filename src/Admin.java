import java.util.Scanner;

public class Admin {
    private int numOfPlayers;
    private Player[] playerArr;
    
    public int startNewGame(){
        Scanner in = new Scanner(System.in);
        String newName;
        int newBalance;
        
        System.out.printf("Please enter the number of players: ");
        numOfPlayers = in.nextInt();
        
        in.nextLine();  // Dump the character '\n'
        
        playerArr = new Player[numOfPlayers];
        
        for(int i = 0; i < numOfPlayers; i++){
            System.out.printf("Please enter player %d's name: ", i + 1);
            newName = in.nextLine();
            
            System.out.printf("Please enter player %d's balance: ", i + 1);
            newBalance = in.nextInt();
            
            in.nextLine();  // Dump the character '\n'
            
            playerArr[i].setPlayerName(newName);
            playerArr[i].setBalance(newBalance);
        }
        
        in.close();
        return numOfPlayers;
    }
}
