package dicegameapp;

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
    
    public String plr(){
        String result = "";
        
        if(rankBoard.size() == 0){
            result += "\t\tNo Record!!\n";
        }
        else{
            result += "=========================================================================\n";
            result += "\n\t\tRanking Board\n\n";
            result += "=========================================================================\n";
            
            Vector<RankRecord> record = rankBoard.get(rankBoard.size() - 1);
            
            result += "\t\tRound " + rankBoard.size() + "\n";
            for(int i = 0; i < record.size(); i++){
            	if( record.get(i).isTie() ){
            		result += "\t\tTied!!! NO WINNER :(\n";
            	}
            	else{
                    result += "\t\tWinner:\t" + record.get(i).getWinnerName() + "\n";
                    result += "\t\tScore:\t" + record.get(i).getWinnerScore() + "\n";
            	}
            }
            
            result += "--------------------------------------------------------------------------------------\n";
        }
        return result;
    }
    
    //get output rank record for textArea field
    public String prb(){
    	String result = "";
    	
    	if(rankBoard.size() == 0){
            result += "\t\tNo Record!!\n";
        }
       
        else{
            result += "=========================================================================\n";
            result += "\n\t\tRanking Board\n\n";
            result += "=========================================================================\n";
            
            for(int i = 0; i < rankBoard.size(); i++){
                result += "\t\tRound " + (i + 1) + "\n";
                
                Vector<RankRecord> record = rankBoard.get(i);
                
                for(int j = 0; j < record.size(); j++){
                	if( record.get(j).isTie() ){
                		result += "\t\tTied!!! NO WINNER :(\n";
                	}
                	else{
                		result += "\t\tWinner:\t" + record.get(j).getWinnerName() + "\n";
                		result += "\t\tScore:\t" + record.get(j).getWinnerScore() + "\n";
                	}
                }
                
                result += "-------------------------------------------------------------------------------------\n";
            }
        }
        return result;
    }
    
    public int size(){
        return rankBoard.size();
    }
}
