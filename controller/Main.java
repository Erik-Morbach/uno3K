package controller;

import java.util.ArrayList;

import entity.CyclicalPlayerList;
import entity.Game;
import entity.Menu;
import entity.Player;

public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		Player player1 = new Player("Jogador 1",false); 
		Player player2 = new Player("Jogador 2",false);
		Player player3 = new Player("Jogador 3",false);
		Player player4 = new Player("Jogador 4",false);
		
		ArrayList<Player> players = new ArrayList<Player>();

		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		CyclicalPlayerList list = new CyclicalPlayerList(players);
		
		game.setPlayerList(list);
		
		Menu.tutorialDisplay();
		
//		do {
			Menu.handleActionDisplay(game.getCurrentPlayer().getHand());
			game.executeRound();
//		} while(true);

		
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

}
