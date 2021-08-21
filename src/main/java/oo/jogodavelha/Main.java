package oo.jogodavelha;

import java.util.Map.Entry;

import java.util.Scanner;

import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;
import oo.jogodavelha.models.Coordenada;
import oo.jogodavelha.models.Jogada;
import oo.jogodavelha.models.Jogo;


public class Main {

	public Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		Coordenada c = new Coordenada(1,3);
		Jogada j = new Jogada('X',c);
		Jogo g = new Jogo();
		g.init();
		
//			{ "0,0,X,X", "0,0,X,O", "0,0,O,O", "0,0,O,X",
//			 "0,1,X,X", "0,1,X,O", "0,1,O,O", "0,1,O,X",
//			 "0,2,X,X", "0,2,X,O", "0,2,O,O", "0,2,O,X",
//			 "1,0,X,X", "1,0,X,O", "1,0,O,O", "1,0,O,X",
//			 "1,1,X,X", "1,1,X,O", "1,1,O,O", "1,1,O,X",
//			 "1,2,X,X", "1,2,X,O", "1,2,O,O", "1,2,O,X",
//			 "2,0,X,X", "2,0,X,O", "2,0,O,O", "2,0,O,X",
//			 "2,0,X,X", "2,1,X,O", "2,1,O,O", "2,1,O,X",
//			 "2,0,X,X", "2,2,X,O", "2,2,O,O", "2,2,O,X",})
		
		
		g.add(new Jogada('X',new Coordenada(0,3)));
		g.add(new Jogada('X',new Coordenada(0,1)));
		
		g.add(new Jogada('X',new Coordenada(1,2)));
	
		g.add(new Jogada('O',new Coordenada(2,2)));
		g.add(new Jogada('O',new Coordenada(2,1)));
		g.add(new Jogada('O',new Coordenada(2,0)));
		g.showBoard();
		
		
		
	}

}
