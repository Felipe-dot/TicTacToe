package myGame;

import java.util.Scanner;

public class Jogada extends Coordenada{

	Scanner teclado = new Scanner(System.in);
	private Coordenada jogada1 = new Coordenada();
	private Coordenada jogada2 = new Coordenada();
		
	public Coordenada getJogada1() {
		return jogada1;
	}

	public void setJogada1(Coordenada jogada1) {
		this.jogada1 = jogada1;
	}
	
	public Coordenada getJogada2() {
		return jogada2;
	}

	public void setJogada2(Coordenada jogada2) {
		this.jogada2 = jogada2;
	}

	

}
