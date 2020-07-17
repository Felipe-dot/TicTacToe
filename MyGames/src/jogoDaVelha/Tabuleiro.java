package jogoDaVelha;

public class Tabuleiro {
	
	// Criando o tabuleiro
	
	String tabuleiro[][] = new String[3][3];
	int linha;
	int coluna;
	int linhaPc;
	int colunaPc;
	
	//Limpando o tabuleiro
	
	public void resetTabuleiro(String tabuleiro[][]) {
		for(int l = 0;l < 3; l++){
			for(int c = 0; c< 3; c++) {
				tabuleiro[l][c] = "";
			}
		}
	} 
	
	// Mostrando o tabuleiro
	
	public void showTabuleiro(String tabuleiro[][]) {
		for(int l = 0;l < 3; l++){
			 for(int c = 0; c< 3; c++) {
					System.out.print("["+ tabuleiro[l][c] + "]");
			}
			 System.out.println("");
		}
	}

}
