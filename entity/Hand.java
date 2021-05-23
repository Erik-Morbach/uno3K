package entity;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private ArrayList<Card> cards;
    private final int maxInitialCards = 7; 
    
    public Hand(){
    	this.cards = new ArrayList<Card>();
    	for (int i = 0; i < this.maxInitialCards; i++)
    		this.cards.add(CardGenerator.execute());
    }

    public void addCard(Card card){
        cards.add(card);
    }
    
    public int getLength() {
    	return cards.size();
    }

    public Card discartCard(Card selected){
    	cards.remove(selected);
    	return selected;
    } 
    
    
    public Card getValid(Card center){
        for(Card current: this.cards){
        	if(current.compare(center)) {
            	return current;
            }
        }
        return null;
    }

    public String getCardsInLine() {
        String response = "";
        boolean first = true;
        
        int count = 0;
        
        for(Card card: cards){
            if(!first) response += " ";
            first = count%4 == 3;
            String space = ++count%4 == 0 ? "\n" : "";
            response += card.toString()+space;
        }
        return "["+ this.getLength() +" cartas]\n"+response;
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
