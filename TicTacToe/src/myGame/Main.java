package myGame;

public class Main {

	public static void main(String[] args) {

		boolean trueOrFalse = false;
		Tabuleiro tabuleiro = new Tabuleiro();

		tabuleiro.resetaTabuleiro(tabuleiro.getTabuleiro());

		for(int i = 0; i<9; i++) {
			tabuleiro.mostraTabuleiro(tabuleiro.getTabuleiro());
			tabuleiro.lerCoordenada(tabuleiro.getTabuleiro(), tabuleiro.x);
			tabuleiro.lerCoordenada(tabuleiro.getTabuleiro(), tabuleiro.o);
			if(i > 4) {
				trueOrFalse = tabuleiro.ganhadorLinha(tabuleiro.getTabuleiro());
				trueOrFalse = tabuleiro.ganhadorColuna(tabuleiro.getTabuleiro());
				trueOrFalse = tabuleiro.ganhadorDiagonais(tabuleiro.getTabuleiro());				
			}
			if(trueOrFalse) 
				break;

		}
	}
}
