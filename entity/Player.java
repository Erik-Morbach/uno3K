package entity;

public abstract class Player {
    private Player nextPlayer;
    private Player previousPlayer;
    private Hand hand;
    private String nome;
	public Player(String nome) {
		super();
		this.hand = new Hand();
		this.nome = nome;
	}
	public Player() {
		super();
	}
	
	
	public abstract void discartAction();
	public abstract void buyAction();
	
	
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

    
}
