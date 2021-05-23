package controller;

import entity.BotPlayer;
import entity.CyclicalPlayerList;
import entity.Game;
import entity.Menu;
import entity.Player;
import entity.UserPlayer;

public class Main {
	public static void main(String[] args) {
		System.out.print("Por favor, insira seu nome: ");
		String playername = Menu.scanner.nextLine();
		
		Player player1 = new UserPlayer(playername); 
		Player player2 = new BotPlayer("Erik");
		Player player3 = new BotPlayer("Eduardo");
		Player player4 = new BotPlayer("Arthur");

		CyclicalPlayerList list = new CyclicalPlayerList();
		list.push(player1);
		list.push(player2);
		list.push(player3);
		list.push(player4);
		
		Game game = Game.getInstance(list);
		
		Menu.tutorialDisplay();
		
		while(true) {
			System.out.println("##########################################################");
			sleep();
			Menu.handleDisplayGameSituation(game);
			
			boolean win = game.play();
			
			if(win) break;
		}
		
		System.out.println("##########################################################");
		System.out.println("PARABENS "+game.getCurrentPlayer().getName().toUpperCase()+" VOCÊ GANHOU O UNO DA 3K!!!");
	}
	
	public static void sleep() {
		System.out.println("Digite qualquer coisa para continuar!");
		Menu.scanner.nextLine();
	}
}

