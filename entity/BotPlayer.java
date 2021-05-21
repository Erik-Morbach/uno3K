package entity;

public class BotPlayer extends Player {
	public BotPlayer() {}

	@Override
	public boolean discartAction() {
		// TODO Auto-generated method stub
		try {
			Card card = this.hand.getValid(Game.getInstance().getCenterCard());
		
			this.hand.discartCard(card);
		}catch(Error e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean buyAction() {
		try {
			Card newCard = Game.getInstance().generateCard();
			
			this.hand.addCard(newCard);
		}catch(Error e) {
			return false;
		}
		return true;
	}
	
	
}

