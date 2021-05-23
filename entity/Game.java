package entity;


public class Game {
    private Card centerCard;
    private Player currentPlayer;
    private CyclicalPlayerList playerList;
  
    private static Game instance;
    private Game() {
    	this.playerList = null;
    	this.centerCard = null;
    	this.currentPlayer = null;
    }
    private Game(CyclicalPlayerList playerList) {
    	this.playerList = playerList;
    	this.currentPlayer = playerList.getHead();
    	centerCard = buyCard();
    }

    public static Game getInstance(CyclicalPlayerList playerList) {
    	if(instance==null) 
    		instance = new Game(playerList);
    	return instance;
    }
    public static Game getInstance() {
    	if(instance==null) 
    		throw new Error("Instancia ai meu!");
    	
    	return Game.instance;
    }

    public boolean play(){
        this.currentPlayer.play();	
        return endTurn();
    }

    
    public boolean endTurn(){
    	if(this.currentPlayer.getHand().getLength() == 0)
    		return true;
        Player nextCurrentPlayer = this.playerList.getNextPlayer(this.currentPlayer);
        this.currentPlayer = nextCurrentPlayer;
        return false;
    }
    public Card buyCard(){
    	return CardGenerator.execute();
    }
    public void discartCard(Card newCenter){ 
    	this.centerCard = newCenter;
    	
    	// implementação futura
    	if(this.centerCard instanceof SpecialCard) {
    		executeSpecialFunction((SpecialCard) this.centerCard);
    	}
    }
    private void executeSpecialFunction(SpecialCard specialCard){

    }
    
	public Card getCenterCard() {
		return centerCard;
	}
	public void setCenterCard(Card centerCard) {
		this.centerCard = centerCard;
	}
  public Player getCurrentPlayer() {
		if(this.currentPlayer == null)
			this.currentPlayer = this.playerList.getHead();
		return currentPlayer;
	}
	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	public CyclicalPlayerList getPlayerList() {
		return playerList;
	}


	public void setPlayerList(CyclicalPlayerList playerList) {
		this.playerList = playerList;
	}

    
}


