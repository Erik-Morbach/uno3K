package entity;

import enums.Action;

public class UserPlayer extends Player {
	public UserPlayer() {
		super();
	}
	public UserPlayer(String name) {
		super(name);
	}

	@Override
	public Card discartAction() {
		Menu.handleDisplayUserCards(super.hand);
		Card card = getCard();
		
		if(card!=null) 
			this.hand.discartCard(card);

		
		return card;	
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
		Menu.handleActionDisplay(null);
		
		Action action = getAction();
		switch(action) {
		case DISCART:
			discartAction();
			super.showAction(Action.DISCART);
			break;
		case BUY_IT:
			buyAction();
			super.showAction(Action.BUY_IT);
			break;
		}
	}
	private Action getAction() {
		int option;
		while(true) {
			try {
				option = Menu.scanner.nextInt();
				switch(option) {
					case 1:
						if(validate(Action.DISCART))
							return Action.DISCART;
						
						break;
					case 2:
						if(validate(Action.BUY_IT))
							return Action.BUY_IT;
						break;
				}
			}catch(Error e) {
			}
			errorMessage();
		}
	}
	private boolean validate(Action action) {
		Card center = Game.getInstance().getCenterCard();
		
		boolean valid = this.hand.getValid(center)!=null;
		
		if(action==Action.DISCART) return valid;
		
		return !valid;
	}
	private Card getCard() {
		String option;
		while(true) {
			try {
				option = Menu.scanner.next();
			
				if(option.length()>1) {
					errorMessage();
					continue;
				}
				char value = option.charAt(0);
				if(value>='A' && value<='Z') {
					int number = value-'A';
					return this.hand.getCards().get(number);
				}
			}catch(Error e) {
			}
			errorMessage();
		}
	}
	private void errorMessage() {
		System.out.println("Tente novamente!");
	}
	
}
