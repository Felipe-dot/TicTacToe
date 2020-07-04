package myGame;

public class Tabuleiro extends Jogada{
	
	private String tabuleiro[][] = new String[3][3];
	private String jogador1;
	private String jogador2;


	public String[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(String tabuleiro[][]) {
		this.tabuleiro = tabuleiro;
	}


	public String getJogador1() {
		return jogador1;
	}

	public void setJogador1(String jogador1, String string) {
		this.jogador1 = jogador1;
	}

	public String getJogador2() {
		return jogador2;
	}

	public void setJogador2(String jogador2, String string) {
		this.jogador2 = jogador2;
	}

	public boolean getJogadores(String jogador1, String jogador2) {
		if(jogador1 != null || jogador2 != null) {
			return true;
		}
		return false;
	}
	
	public  void resetaTabuleiro(String tabuleiro[][]) {
		for(int x = 0;x<3;x++) {
			for(int l = 0;l<3;l++) {
				tabuleiro[x][l] = "";
			}
		}	
	}
	
	public void mostraTabuleiro(String tabuleiro[][]) {
		for(int x = 0;x<3;x++) {
			for(int l = 0;l<3;l++) {
				System.out.print("[ " + tabuleiro[x][l] + " ] ");
			}
			System.out.println("");
		}	
	}


	public boolean getSimbolos(String jogador1, String jogador2) {
		if(jogador1 != jogador2) {
			return true;
		}	
		return false;
	}
		
	public void atribuiJogadaX(String[][] tabuleiro,Coordenada jogada) {
		tabuleiro[jogada.linha][jogada.coluna] = jogada.x;
	}
	
	public void atribuiJogadaO(String[][] tabuleiro,Coordenada jogada) {
		tabuleiro[jogada.linha][jogada.coluna] = jogada.o;
	}
	
	

}
