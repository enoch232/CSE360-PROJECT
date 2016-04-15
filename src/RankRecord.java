
public class RankRecord {
    private String winnerName;
    private int winnerPoints;
    private boolean isTie;
    
    RankRecord(){
        isTie = false;
    }
    
    public void setWinnerName(String name){
        winnerName = name;
    }
    
    public void setWinnerPoints(int points){
        winnerPoints = points;
    }
    
    public void setTie(){
        isTie = true;
    }
    
    public String getWinnerName(){
        return winnerName;
    }
    
    public int getWinnerPoints(){
        return winnerPoints;
    }
    
    public boolean isTie(){
        return isTie;
    }
}
