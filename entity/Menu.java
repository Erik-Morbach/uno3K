package entity;

import java.util.Scanner;

import enums.Action;
public class Menu {
    public static Scanner scanner = new Scanner(System.in);

    public static void tutorialDisplay() {
        System.out.println("Bem vindo ao Uno da 3K!!!\n\nVocê jogará contra 3 computadores, uma carta estará sempre ao centro, o objetivo do jogo é descartar todas as cartas que estão em sua mão\nPara poder descartar uma carta, ela deve ter ou o mesmo número, ou a mesma cor que a carta do centro da mesa\nA ultima carta que foi descartada sempre fica ao centro para o proximo jogador realizar sua jogada\n\n");
        
    }
 
    public static void handleSpecialDisplay(SpecialCard card) {
        switch(card.getSpecial()) { 
            case CHOOSE_COLOR:
            
            case PLUS_4:
                System.out.println("Escolha uma cor");
     
                break;
		default:
			break;
        }
    } 
    
    public static void handleActionDisplay(Hand cards) { 
        System.out.println("SUA VEZ!\ndigite o número correspondente a ação que deseja tomar");
        System.out.println("sua mão: " + cards.getCardsInLine());
        System.out.printf("%d-DISCARTAR CARTA, %d-COMPRAR CARTA: ", Action.DISCART.getValue(), Action.BUY_IT.getValue());
    }
    
}

// %02d ->  vai aparecer o número com duas casa e se não 
// tiver duas casa vai completar com zero
// %d int
// %lld long
// %f float
// %s string
