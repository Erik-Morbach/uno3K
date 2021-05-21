package entity;

import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand(){
    }
    public Hand(List<Card> cards){
        this.cards = cards;
    }
    public Hand(int numberOfCards){

    }

    public void addCard(Card card){
        cards.add(card);
    }

    public Card discartCard(Card selected){
        
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
