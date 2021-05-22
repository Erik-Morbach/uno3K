package controller;


import entity.BotPlayer;
import entity.CyclicalPlayerList;
import entity.Game;
import entity.Menu;
import entity.Player;
import entity.UserPlayer;

public class Main {
	public static void main(String[] args) {
		Player player1 = new UserPlayer("Jogador 1"); 
		Player player2 = new BotPlayer("Jogador 2");
		Player player3 = new BotPlayer("Jogador 3");
		Player player4 = new BotPlayer("Jogador 4");

		CyclicalPlayerList list = new CyclicalPlayerList();
		list.push(player1);
		list.push(player2);
		list.push(player3);
		list.push(player4);
		
		Game game = Game.getInstance(list);
		
		Menu.tutorialDisplay();
		
		while(true) {
			
			sleep();
			// Mostrar mapa/situação do jogo
			// cartas do jogador
			if(game.getCurrentPlayer() instanceof UserPlayer)
				Menu.handleActionDisplay(game.getCurrentPlayer().getHand());
			game.executeRound();
		}

		
		/*
			Na etapa intermediária, deve-se apresentar o pacote de persistência
			(entidades) em Java e seu testes em um fluxo do programa principal, 
			além de uma listagem das
			principais funcionalidades do programa (requisitos funcionais) e uma 
			breve descrição do fluxo de
			interação do usuário (como as funcionalidades se encaixam, 
			por exemplo). 
		/* 
			REQUISITOS FUNCIONAIS
			RF 01 O software deve ter um módulo de iniciar o jogo
			RF 02 O software deve permitir o jogador de jogar contra N bot's
			RF 03 O software deve permitir que o jogo corra normalmente para o jogador
			RF 04 O software deve permitir o jogador vencer a partida
			RF 05 O software deve permitir o jogador perder a partida
			RF 06 O software deve permitir o jogador reiniciar a partida
		*/
		
	}
	
	public static void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

