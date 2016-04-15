import java.util.Vector;


public class RankBoard {
    private Vector<RankRecord> rankBoard;
    
    RankBoard(){
        rankBoard = new Vector<RankRecord>(10, 5);
    }
    
    public void addNewRecord(RankRecord newRecord){
        rankBoard.add(newRecord);
    }
    
    public void printRankBoard(){
        if(rankBoard.size() == 0){
            System.out.printf("No Record!!");
        }
        else{
            System.out.printf("===========================================================\n");
            System.out.printf("\n\t\t\t\tRanking Board\n");
            System.out.printf("===========================================================\n");
            
            for(int i = 0; i < rankBoard.size(); i++){
                System.out.printf("Round %d\n", i + 1);
                System.out.printf("Winner:\t%s\n", rankBoard.get(i).getWinnerName());
                System.out.printf("Winner:\t%d\n", rankBoard.get(i).getWinnerPoints());
                System.out.printf("-----------------------------------------------------------\n");
            }
        }
    }
}
