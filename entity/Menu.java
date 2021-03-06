package entity;

import java.util.Scanner;

import enums.Action;
public class Menu {
    public static Scanner scanner = new Scanner(System.in);

    public static void tutorialDisplay() {
        System.out.println("Bem vindo ao Uno da 3K!!!\n\nVocê jogará contra 3 computadores, uma carta estará sempre ao centro,\no objetivo do jogo é descartar todas as cartas que estão em sua mão\nPara poder descartar uma carta, ela deve ter, ou o mesmo número,\nou a mesma cor que a carta do centro da mesa\nA ultima carta que foi descartada sempre fica ao centro para\no proximo jogador realizar sua jogada, a representação das cartas em tela é a seguinte:\n\n(NUMERO DA CARTA|COR DA CARTA)\n\n");
        
    }
 
    public static void handleActionDisplay(Hand cards) { 
        System.out.println("SUA VEZ!\ndigite o número correspondente a ação que deseja tomar");
        System.out.printf("%d-DISCARTAR CARTA, %d-COMPRAR CARTA: ", Action.DISCART.getValue(), Action.BUY_IT.getValue());
    }
    
    public static void handleDisplayGameSituation(Game game) {
    	Player player = game.getPlayerList().getHead();
    	String playerHand = "";
    	for (int i = 0; i < game.getPlayerList().getSize(); i++) {
    		if(player instanceof UserPlayer) {
    			playerHand = player.getHand().getCardsInLine();
    			continue;
    		};
			System.out.println("Jogador: "+player.getName() + " - N° de cartas: "+ player.getHand().getLength()+"\n");
			player = player.getNextPlayer();
		}
    	System.out.println("SUA MÃO: "+ playerHand);
    	System.out.println("\nPROXIMO JOGADOR: " + game.getCurrentPlayer().getName().toUpperCase()+"\n");
    	
    	System.out.println("CARTA AO CENTRO DA MESA: " + game.getCenterCard().toString()+"\n");
    }
    
    public static void handleDisplayUserCards(Hand userHand) {
    	System.out.println("Qual carta você deseja descartar?\n");
    	System.out.println(userHand.getCardsInColumn());
    }
}

// %02d ->  vai aparecer o número com duas casa e se não 
// tiver duas casa vai completar com zero
// %d int
// %lld long
// %f float
// %s string
