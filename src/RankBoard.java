import java.util.Vector;
import java.util.ArrayList;


public class RankBoard {
    private ArrayList<Vector<RankRecord>> rankBoard;
    
    RankBoard(){
        rankBoard = new ArrayList<Vector<RankRecord>>();
    }
    
    public void addNewRecord(Vector<RankRecord> newRecord){
        rankBoard.add(newRecord);
    }
    
    public void printRankBoard(){
        if(rankBoard.size() == 0){
            System.out.printf("No Record!!");
        }
        else{
            System.out.printf("===========================================================\n");
            System.out.printf("\n\t\tRanking Board\n\n");
            System.out.printf("===========================================================\n");
            
            for(int i = 0; i < rankBoard.size(); i++){
                System.out.printf("Round %d\n", i + 1);
                
                Vector<RankRecord> record = rankBoard.get(i);
                
                for(int j = 0; j < record.size(); j++){
                	if( record.get(j).isTie() ){
                		System.out.printf("Tied!!! NO WINNER :(\n");
                	}
                	else{
                		System.out.printf("Winner:\t%s\n", record.get(j).getWinnerName());
                        System.out.printf("Winner:\t%d\n", record.get(j).getWinnerPoints());
                	}
                }
                
                System.out.printf("-----------------------------------------------------------\n");
            }
        }
    }
}
