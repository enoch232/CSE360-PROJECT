
public class RankRecord {
    private String winnerName;
    private int winnerScore;
    private boolean isTie;
    
    RankRecord(){
        isTie = false;
    }
    
    public void setWinnerName(String name){
        winnerName = name;
    }
    
    public void setWinnerScore(int score){
        winnerScore = score;
    }
    
    public void setTie(){
        isTie = true;
    }
    
    public String getWinnerName(){
        return winnerName;
    }
    
    public int getWinnerScore(){
        return winnerScore;
    }
    
    public boolean isTie(){
        return isTie;
    }
}
