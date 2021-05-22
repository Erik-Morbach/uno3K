package entity;
import java.util.Iterator;
import java.util.Random;

import enums.CardColor;

public class CardGenerator {
    public static Card execute() {
        Random random = new Random();
        int rndCard = random.nextInt(4);
        
        CardColor[] colors = CardColor.values();
        CardColor color = CardColor.RED; // default
        
        for (int i = 0; i < rndCard; i++) {
        	color = colors[i];
		}
        
        int rndNumber = random.nextInt(9);
        
        // para implementa��es futuras
        return new CommonCard(rndNumber, color);
    }
}