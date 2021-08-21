package oo.jogodavelha.models;

import java.util.ArrayList;

import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;

public class Jogo extends Tabuleiro {

	public ArrayList<Character> historicoDeJogadas = new ArrayList<Character>();

	public void init() {
	}

	public void add(Jogada jogada)throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido{
		try {
		    if (check(jogada)) {
			historicoDeJogadas.add(jogada.getC());
			getBoard().put(jogada.getCoordenada(), jogada.getC());
		    }
		}catch(ExcecaoPorSimboloInvalido | ExcecaoPorCoordenadaInvalida s) {
			throw s;
		}
	}

	public boolean check(Jogada umaJogada) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido{
		int x = umaJogada.getCoordenada().getX();
		int y = umaJogada.getCoordenada().getY();

		// Gambiarra
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
		

		// Verificando se o jogador está fazendo 2 jogadas seguidas
		if (historicoDeJogadas.isEmpty()) {
			System.out.println("Historico de jogadas vazio");
		} else if (historicoDeJogadas.get(historicoDeJogadas.size() - 1).equals(umaJogada.getC())) {
				ExcecaoPorSimboloInvalido n = new ExcecaoPorSimboloInvalido("Jogada inválida por já ter um simbolo no local");
				throw n;
		}

		// Verificando se a coordenada informada é válida
		if (x > 2 || x < 0 || y > 2 || y < 0) {
				ExcecaoPorCoordenadaInvalida n = new ExcecaoPorCoordenadaInvalida("Coordenada informada é inválida");
				throw n;
			// Verificando se na coordenada informada já existe um simbolo
		} else if (board[x][y].equals('X') || board[x][y].equals('O')) {
				ExcecaoPorCoordenadaInvalida n = new ExcecaoPorCoordenadaInvalida("Coordenada informada é inválida");
				throw n;
			//Lançar excessão por simbolo inválida
		} else {
			return true;
		}
		
		

		/*
		 * for (Coordenada c : getBoard().keySet()) { if
		 * (getBoard().containsKey(umaJogada.getCoordenada()) { return false; } }
		 */
	}
	
	// throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido
	private static void test1() throws ExcecaoPorSimboloInvalido {
		ExcecaoPorSimboloInvalido n = new ExcecaoPorSimboloInvalido("Jogada inválida por já ter um simbolo no local");
		throw n;
	}
	
	private static void test() throws ExcecaoPorCoordenadaInvalida {
		ExcecaoPorCoordenadaInvalida n = new ExcecaoPorCoordenadaInvalida("Coordenada informada é inválida");
		throw n;
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