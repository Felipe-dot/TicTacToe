package oo.jogodavelha.models;

import java.util.ArrayList;
import java.util.HashMap;


public class Tabuleiro {
	// protected String board[][] = new String[3][3];
	protected HashMap<Coordenada, Character> board = new HashMap<Coordenada, Character>();

	public HashMap<Coordenada, Character> getBoard() {
		return board;
	}

	public void setBoard(HashMap<Coordenada, Character> board) {
		this.board = board;
	}
	
}
