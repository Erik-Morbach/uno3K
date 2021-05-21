package entity;

import java.util.List;

import enums.Orientation;

public class CyclicalPlayerList {

    private Orientation orientation;
    private Player head;
    private Player tail;
    private int size;


    public CyclicalPlayerList(){ 
        this.orientation = Orientation.CLOCK_WISE;
        this.size = 0;
    }
    public CyclicalPlayerList(List<Player> playerList){ 
        this.orientation = Orientation.CLOCK_WISE;
        this.size = playerList.size();
        Player last = null;
        for(Player current: playerList){
            if(last==null) {
                this.head = current;  
                last = this.head;
                continue;
            }

            last.setNextPlayer(current);
            current.setPreviousPlayer(last);
            last = current;
        } 
        if(last!=null){
            this.tail = last;
            this.tail.setNextPlayer(this.head);
            this.head.setPreviousPlayer(last);
        }
    }
    
    public void push(Player newPlayer){
         if(this.head!=null){
            newPlayer.setNextPlayer(this.head);
            this.head.setPreviousPlayer(newPlayer);
            this.head = newPlayer;
            this.tail.setNextPlayer(this.head);
            this.head.setPreviousPlayer(this.tail);
        }
        else {
            this.head = newPlayer;
            this.tail = newPlayer;
        }        
    }

    public Player getNextPlayer(Player currentPlayer){
        if(this.orientation == Orientation.CLOCK_WISE)
            return currentPlayer.getNextPlayer();
        if(this.orientation == Orientation.COUNTER_CLOCK_WISE)
            return currentPlayer.getPreviousPlayer();
        return null;
    }
    public void swapOrientation() { 
    	if(this.orientation==Orientation.CLOCK_WISE) 
    		this.orientation=Orientation.COUNTER_CLOCK_WISE;
    	else this.orientation=Orientation.CLOCK_WISE;
    }
}
