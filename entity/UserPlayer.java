package entity;

public class UserPlayer extends Player {
	public UserPlayer() {
		super();
	}
	public UserPlayer(String name) {
		super(name);
	}

	@Override
	public Card discartAction() {
		// Ask menu for a card to remove
		// card = menu.getValidOption();
		// perguntaQualCarta()
		// pegaResposta()
		Card card = null;
		
		if(card!=null) 
			this.hand.discartCard(card);

		return card;	
		// Show hand to menu
	}
	

	@Override
	public Card buyAction() {
		Card newCard = CardGenerator.execute();
		//show newCard in menu
		this.hand.addCard(newCard);
		return newCard;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		// pergunto()
		// pegaResposta(2)
		if(discartAction()!=null) 
			return;
		
		buyAction();
	}
	
}
