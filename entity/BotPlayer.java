package entity;

public class BotPlayer extends Player {
	public BotPlayer() {}

	@Override
	public Card discartAction() {
		Card center = Game.getInstance().getCenterCard();
		Card currentCard = this.hand.getValid(center);
		if(currentCard==null) return null;
			
		this.hand.discartCard(currentCard);
		return currentCard;
	}

	@Override
	public Card buyAction() {
		Card newCard = CardGenerator.execute();
			
		this.hand.addCard(newCard);
		
		return newCard;
	}
	
	
	public void play() {
		if(discartAction()!=null) 
			return;
		buyAction();
	}
}

