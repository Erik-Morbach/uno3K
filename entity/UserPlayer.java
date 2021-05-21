package entity;

public class UserPlayer extends Player {
	public UserPlayer() {}

	@Override
	public boolean discartAction() {
		// TODO Auto-generated method stub
		try {
			// Ask menu for a card to remove
			Card card = null;
			
			this.hand.discartCard(card);
			
			// Show hand to menu
		} catch(Error e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean buyAction() {
		// TODO Auto-generated method stub
		try {
			Card newCard = Game.getInstance().generateCard();
			//show newCard in menu
			this.hand.addCard(newCard);
			
			// Show hand in menu
		} catch(Error e) {
			return false;
		}
		return true;
	}
	
}
