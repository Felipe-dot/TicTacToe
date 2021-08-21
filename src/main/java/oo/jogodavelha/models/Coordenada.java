package oo.jogodavelha.models;

public class Coordenada {
	private int x;
	private int y;
	
	public Coordenada(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
