package entity;

import enums.Action;

public class BotPlayer extends Player {
	public BotPlayer() {
		super();
	}
	public BotPlayer(String name) {
		super(name);
	}

	@Override
	public Card discartAction() {
		Card center = Game.getInstance().getCenterCard();
		Card currentCard = this.hand.getValid(center);
		if(currentCard==null) return null;
			
		this.hand.discartCard(currentCard);
		
		Game.getInstance().discartCard(currentCard);
		
		return currentCard;
	}

	@Override
	public Card buyAction() {
		Card newCard = CardGenerator.execute();
			
		this.hand.addCard(newCard);
		
		return newCard;
	}
	
	
	public void play() {
		if(discartAction()!=null) {
			super.showAction(Action.DISCART);
			return;
		}
		buyAction();
		super.showAction(Action.BUY_IT);
	}
}

