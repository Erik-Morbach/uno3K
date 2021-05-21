package entity;

public class Player {
    private Player nextPlayer;
    private Player previousPlayer;
    private Hand hand;
    private boolean isUser;
    private String nome;
	public Player(String nome, boolean isUser) {
		super();
		this.hand = new Hand();
		this.isUser = isUser;
		this.nome = nome;
	}
	public Player() {
		super();
	}
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
	public boolean isUser() {
		return isUser;
	}
	public void setUser(boolean isUser) {
		this.isUser = isUser;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

    
}
