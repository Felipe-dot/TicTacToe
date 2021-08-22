package oo.jogodavelha;

import java.util.Scanner;

import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;

import oo.jogodavelha.models.Jogo;


public class Main {

	public Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		//Iniciando o jogo
		Jogo g = new Jogo();
		g.init();
	
		System.out.println("======================");
		System.out.println("==== TIC TAC  TOE ====");
		System.out.println("======================");
		for(int i = 0; i < 5; i++) {
				g.showBoard();
				//Jogador inicia e faz 5 jogadas
				g.lerJogada(1);
				if(i > 1) {
					if(g.hasWinner()) {
						break;
					}
				}
				// Computador faz 4 jogadas
				g.showBoard();
				if(i<4) {
					g.lerJogada(2);	
				}
				if(i > 1) {
					if(g.hasWinner()) {
						break;
					}
				}
		}
	

	System.out.println("========RESULTADO============");
	g.showBoard();
	System.out.println("========RESULTADO============");
	
	if(!g.hasWinner())
		System.out.println("\n  DEU VELHA");

		g.showBoard();
	
	}

}
