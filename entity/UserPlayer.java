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
		
		if(card!=null) {
			this.hand.discartCard(card);
			Game.getInstance().discartCard(card);
		}
		
		return card;	
	}
	

	@Override
	public Card buyAction() {
		Card newCard = CardGenerator.execute();
		this.hand.addCard(newCard);
		return newCard;
	}

	public void showAction(Action action, Card card) {
		System.out.printf("Você acaba de ");
		switch(action) {
		case BUY_IT:
			System.out.printf("comprar a carta %s!\n",card);
			break;
		case DISCART:
			System.out.printf("colocar a carta %s no centro!\n",card);
			break;
		}	
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		Menu.handleActionDisplay(this.getHand());
		
		Action action = getAction();
		switch(action) {
		case DISCART:
			showAction(Action.DISCART,discartAction());
			break;
		case BUY_IT:
			showAction(Action.BUY_IT,buyAction());
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
						else 
							System.out.println("Você não tem a carta necessária para ser descartada!");
						break;
					case 2:
						if(validate(Action.BUY_IT)) 
							return Action.BUY_IT;
						else 
							System.out.println("Você tem cartas para Jogar!");
							
						
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
		String option = null;
		Card center = Game.getInstance().getCenterCard();
		while(true) {
			try {
				option = Menu.scanner.next();
			}catch(Error e) {}
			if(option.length()>1) {
				errorMessage();
				continue;
			}
			char value = option.charAt(0);
			value = Character.toUpperCase(value);
			if(value>='A' && value<='Z') {
				int number = value-'A';
				if(number <= this.hand.getCards().size()) {
					Card choosed = this.hand.getCards().get(number);
					if(choosed.compare(center)) 
						return choosed;
				}
				replayMessage();
			}
			
			errorMessage();
		}
	}
	private void replayMessage() {
		System.err.println("Carta Invalida!");
	}
	private void errorMessage() {
		System.out.println("Tente novamente!");
	}
	
}
