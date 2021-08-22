package oo.jogodavelha.models;

public class Jogada {
	private Character c;
	private Coordenada coordenada;

	public Jogada(char c, Coordenada coordenada) {
		setC(c);
		setCoordenada(coordenada);
	}

	public Character getC() {
		return c;
	}

	public void setC(Character c) {
		this.c = c;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}
	
	
}
