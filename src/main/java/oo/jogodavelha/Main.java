package oo.jogodavelha;

import java.util.Map.Entry;
import java.util.Scanner;

import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;
import oo.jogodavelha.models.Coordenada;
import oo.jogodavelha.models.Jogada;
import oo.jogodavelha.models.Jogo;
import oo.jogodavelha.models.Tabuleiro;

public class Main {

	public Scanner sc = new Scanner(System.in);

	public static void main(String[] args)  {
		Coordenada c = new Coordenada(1,1);
		Jogada j = new Jogada('X',c);
		Jogo g = new Jogo();
		g.init();
		
		
		
		g.add(new Jogada('X',new Coordenada(0,1)));
		g.add(new Jogada('O',new Coordenada(0,2)));
		g.add(new Jogada('X',new Coordenada(1,2)));
		g.add(new Jogada('0',new Coordenada(2,2)));
		g.add(new Jogada('X',new Coordenada(0,2)));
		
	}

}
