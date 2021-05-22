package entity;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private ArrayList<Card> cards;
// need a boolean to know if this hand is from a user
    public Hand(){
    	this.cards = new ArrayList<Card>();
    	for (int i = 0; i < 7; i++)
    		this.cards.add(CardGenerator.execute());
    }

    public void addCard(Card card){
        // if isUser, let the user select the card
        cards.add(card);
    }

    public Card discartCard(Card selected){
        // if isUser, let the user select the card
    	cards.remove(selected);
    	return selected;
    } 
    
    
    public Card getValid(Card center){
        for(Card current: this.cards){
            if(current.compare(center)) return current;
        }
        return null;
    }

    public String getCardsInLine() {
        String response = "";
        boolean first = true;
        for(Card it: cards){
            if(!first) response += " ";
            first = false;
            response += it.toString();
        }
        return response;
    }

    public String getCardsInColumn() { 
        String column = "";
        char letter = 'A';
        for(Card card : cards) 
            column += letter++ +". "+card.toString()+"\n";
        return column;
    }

    public List<Card> getCards(){
        return cards; 
    }
}
