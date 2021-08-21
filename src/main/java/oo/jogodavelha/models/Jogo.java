package oo.jogodavelha.models;

import java.util.ArrayList;

public class Jogo extends Tabuleiro {
	
	public ArrayList<Character> test = new ArrayList<Character>();

	public void init() {
	}

	public void add(Jogada jogada)  {
		test.add(jogada.getC());
		if (check(jogada)) {
			getBoard().put(jogada.getCoordenada(), jogada.getC());
		} else {
			System.err.println("Jogada Inválida");
		}
	}

	public boolean check(Jogada umaJogada) {
		
		Character board[][] = new Character[3][3];
		for (Coordenada c : getBoard().keySet()) {
			board[c.getX()][c.getY()] = getBoard().get(c);
		}
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if (board[l][c] == null) {
					board[l][c] = '_';
				}
			}
		}
		if(test.isEmpty()) {
			System.out.println("Historico de jogadas vazio");
		}else if(test.get(test.size() - 1).equals('X') || test.get(test.size() -1 ).equals('O')) {
			return false;
		}

		if (umaJogada.getCoordenada().getX() > 2 || umaJogada.getCoordenada().getX() < 0 || umaJogada.getCoordenada().getY() > 2 || umaJogada.getCoordenada().getY() < 0) {
			return false;
		}else if (board[umaJogada.getCoordenada().getX()][umaJogada.getCoordenada().getY()].equals('X') || board[umaJogada.getCoordenada().getX()][umaJogada.getCoordenada().getY()].equals('O')) {
			return false;
		}else {
			return true;
		}

			/*
			 * if (umaJogada.getCoordenada().getX() > 2 || umaJogada.getCoordenada().getX()
			 * < 0 || umaJogada.getCoordenada().getY() > 2 ||
			 * umaJogada.getCoordenada().getY() < 0) { return false; } else { for
			 * (Coordenada c : getBoard().keySet()) { if (getBoard().containsKey(c)) {
			 * return false; } } }
			 */
	}

	public void showBoard() {
		// GAMBIARRA
		Character board[][] = new Character[3][3];
		for (Coordenada c : getBoard().keySet()) {
			board[c.getX()][c.getY()] = getBoard().get(c);
		}
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if (board[l][c] == null) {
					board[l][c] = '_';
				}
				System.out.print(board[l][c] + " | ");
			}
			System.out.println();
		}
	}

	public boolean hasWinner() {
		final Character x = 'X';
		final Character o = 'O';
		int point = 0;

		// GAMBIARRA
		Character board[][] = new Character[3][3];
		for (Coordenada c : getBoard().keySet()) {
			board[c.getX()][c.getY()] = getBoard().get(c);
		}
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if (board[l][c] == null) {
					board[l][c] = '_';
				}
			}
		}

		// # Verifica ganhador por linha
		for (int a = 0; a < 3; a++) {
			if (board[a][0].equals(x) && board[a][1].equals(x) && board[a][2].equals(x)) {
				System.out.println("O jogador 1 ganhou");
				point = 3;
			} else if (board[a][0].equals(o) && board[a][1].equals(o) && board[a][2].equals(o)) {
				System.out.println("O jogador 2 ganhou");
				point = 3;
			}
		}

		// # Verifica ganhador por coluna
		for (int a = 0; a < 3; a++) {
			if (board[0][a].equals(x) && board[1][a].equals(x) && board[2][a].equals(x)) {
				System.out.println("O jogador 1 ganhou");
				point = 3;
			} else if (board[0][a].equals(o) && board[1][a].equals(o) && board[2][a].equals(o)) {
				System.out.println("O jogador 2 ganhou");
				point = 3;
			}
		}

		// # Verifica ganhador nas diagonais
		if (board[0][0].equals(x) && board[1][1].equals(x) && board[2][2].equals(x)) {
			System.out.println("O jogador 1 ganhou");
			point = 3;
		} else if (board[0][0].equals(o) && board[1][1].equals(o) && board[2][2].equals(o)) {
			System.out.println("O jogador 2 ganhou");
			point = 3;
		}

		if (board[2][0].equals(x) && board[1][1].equals(x) && board[0][2].equals(x)) {
			System.out.println("O jogador 1 ganhou");
			point = 3;
		} else if (board[2][0].equals(o) && board[1][1].equals(o) && board[0][2].equals(o)) {
			System.out.println("O jogador 2 ganhou");
			point = 3;
		}

		if (point == 3)
			return true;
		else
			return false;
	}
}