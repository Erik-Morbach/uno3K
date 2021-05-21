package entity;

import enums.Action;

public class Game {
    private Card nextCard;
    private Card centerCard;
    private Player currentPlayer;
    private CyclicalPlayerList playerList;
    private static Game instance;
    private Game() {
    	
    }
    public Game getInstance() {
    	if(Game.instance==null) Game.instance = new Game();
    	return Game.instance;
    }
    

    //private SpecialEffect count;
    public void executeRound(){
        try { 
            Card card = currentPlayer.getHand().getValid(centerCard);
            Action playerAction;
            if(card==null) playerAction = Action.BUY_IT;
            else playerAction = Action.DISCART;
            //
            // boolean canProcced = this.validate(playerAction, playerCard);
            boolean canProcced = false;
            if(!canProcced) return; 
            
            switch(playerAction) {
                case DISCART:
                    this.discartCard();
                break;
                case BUY_IT:
                    this.buyCard(); 
                break;
            }
        } catch(Error error) {
            // exibe ao jogador o erro
        } finally {
            this.endTurn();
        }
        
    }

    private boolean validate(Action action){ 
        if(Action.DISCART == action) {
            // valida se jogador atual pode descatar, não seja igual ao centro
            if(false)
        	throw new Error("Carta diferente drtar");
            // caso a carta que ele deseja discaro centro');
            // se não
            return true;
        }
        if(Action.BUY_IT == action) {
            // valida se jogador atual pode comprar
            // caso ele tiver uma carta que ele pode jogar
            if(false) 
        	throw new Error("motivo");
            // se não
            return true;
        }
        return false;
    }
    private void endTurn(){
        Player nextCurrentPlayer = this.playerList.getNextPlayer(this.currentPlayer);
        this.currentPlayer = nextCurrentPlayer;
        this.generateCard();
    }
    private Card generateCard(){
    	Card generatedCard = CardGenerator.execute();
    	return generatedCard;
    }
    private void buyCard(){
        this.currentPlayer.getHand().addCard(generateCard());
    }
    private void discartCard(){ 
    	
        //Card card = this.currentPlayer.getHand().discartCard();
        //this.centerCard = card;
        //if(card instanceof SpecialCard)
        //    this.executeSpecialFucntion(card);
    }
    private void executeSpecialFucntion(SpecialCard specialCard){

    }
}


