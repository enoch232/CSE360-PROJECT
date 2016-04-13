import java.util.Scanner;

public class Admin {
    public int startNewGame(Player[] playerArr){
        Scanner in = new Scanner(System.in);
        String newName;
        int newBalance;
        int numOfPlayers;
        
        System.out.printf("Please enter the number of players: ");
        numOfPlayers = in.nextInt();
        
        in.nextLine();  // Dump the character '\n'
        
        // System.out.printf("numOfPlayer: %d\n", numOfPlayers);
        playerArr = new Player[numOfPlayers];
        for(int i = 0; i < numOfPlayers; i++)
        	playerArr[i] = new Player();
        // System.out.printf("Creater Players Array.\n");
        
        
        for(int i = 0; i < numOfPlayers; i++){
            System.out.printf("Please enter player %d's name: ", i + 1);
            newName = in.nextLine();
            
            System.out.printf("Please enter player %d's balance: ", i + 1);
            newBalance = in.nextInt();
            
            in.nextLine();  // Dump the character '\n'
            // System.out.printf("newName: %s\tnewBalance: %d\n", "asd", newBalance);
          
            playerArr[i].setPlayerName(newName);
            playerArr[i].setBalance(newBalance);
            // System.out.printf("Success\n");
        }
        
        in.close();
        return numOfPlayers;
    }
}
