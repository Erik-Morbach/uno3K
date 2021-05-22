package entity;

public abstract class Player {
    private Player nextPlayer;
    private Player previousPlayer;
    protected Hand hand;
    protected String nome;
	public Player(String nome) {
		super();
		this.hand = new Hand();
		this.nome = nome;
		this.nextPlayer = null;
		this.previousPlayer = null;
	}
	public Player() {
		super();
		this.nextPlayer=null;
		this.previousPlayer=null;
		this.hand = new Hand();
		this.nome = null;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

    
}
