package dicegameapp;

import java.util.Scanner;

public class Admin {
    protected int target;
    private int numOfPlayers;
    
    Admin(){
        target = 13;        // Default target score
    }
    
    public void setTarget(int newTarget){
        target = newTarget;
    }
    
    public void setNumOfPlayers(int val){
        numOfPlayers = val;
    }
    
    public int getNumOfPlayers(){
        return numOfPlayers;
    }
    
    public int getTarget(){
        return target;
    }
}
