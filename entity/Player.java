package entity;

import enums.Action;

public abstract class Player {
    private Player nextPlayer;
    private Player previousPlayer;
    protected Hand hand;
    protected String name;
	public Player(String name) {
		super();
		this.hand = new Hand();
		this.name = name;
		this.nextPlayer = null;
		this.previousPlayer = null;
	}
	public Player() {
		super();
		this.nextPlayer=null;
		this.previousPlayer=null;
		this.hand = new Hand();
		this.name = null;
	}
	
	public void showAction(Action action) {
		System.out.printf("%s Acaba de ",this.name);
		switch(action) {
		case BUY_IT:
			System.out.println("comprar uma carta!");
			break;
		case DISCART:
			System.out.printf("colocar a carta %s no centro!\n",Game.getInstance().getCenterCard());
			break;
		}
	}
	
	public abstract Card discartAction();
	public abstract Card buyAction();
	public abstract void play();
	
	public Player getNextPlayer() {
		return nextPlayer;
	}
	public void setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}
	public Player getPreviousPlayer() {
		return previousPlayer;
	}
	public void setPreviousPlayer(Player previousPlayer) {
		this.previousPlayer = previousPlayer;
	}
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    
}
