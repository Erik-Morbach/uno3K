package entity;
import enums.CardColor;

public abstract class Card {
    protected CardColor color;

    public Card(CardColor color) {
    	this.color = color;
    }
    
    public boolean compare(Card card){
//        if(this.color==CardColor.BLACK) return true;
        if(this.color==card.color) return true;
        if(card instanceof CommonCard && this instanceof CommonCard) 
        	return ((CommonCard)this).getNumber()==((CommonCard)card).getNumber(); 
        return false;
    }
	
}