package entity;

import java.util.Scanner;

import enums.Action;
public class Menu {
    private Scanner scanner;
    private Menu instance;

    private Menu() {
        this.scanner = new Scanner(System.in);
    }

    public Menu getInstance() {
        if(instance==null) this.instance = new Menu();
        return this.instance;
    } 

    public void tutorialDisplay() {
        // explicação do jogo
    }
 
    public void handleSpecialDisplay(SpecialCard card) {
        switch(card.getSpecial()) { 
            case CHOOSE_COLOR:
            
            case PLUS_4:
                System.out.println("Escolha uma cor");
     
                break;
		default:
			break;
        }
    } 
    public int handleActionDisplay(Hand cards) { 
        System.out.println("SUA VEZ!\ndigite o número correspondente a ação que deseja tomar");
        System.out.println("sua mão: " + cards.getCardsInLine());
        System.out.printf("%d-DISCARTAR CARTA, %d-COMPRAR CARTA: ", Action.DISCART , Action.BUY_IT);
        int numberAction = this.scanner.nextInt(); 
        if(numberAction==Action.BUY_IT.getValue())
        	return -1;
        if(numberAction==Action.DISCART.getValue()) {
            System.out.println("insira o numero a esquerda da carta que deseja jogar:\n\n"+cards.getCardsInColumn());
            int cardIndex = this.scanner.nextInt();
            return cardIndex;
        }
        return -1;//?
    }
}

// %02d ->  vai aparecer o número com duas casa e se não 
// tiver duas casa vai completar com zero
// %d int
// %lld long
// %f float
// %s string
