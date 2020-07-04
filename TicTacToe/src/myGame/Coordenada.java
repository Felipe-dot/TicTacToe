package myGame;

import java.util.Scanner;

public class Coordenada extends FimDeJogo{
	int linha;
	int coluna;
	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public void lerCoordenada(String tabuleiro[][], String simbolo) {
		Scanner teclado = new Scanner(System.in);
		 do {
			  System.out.println("Faça uma jogada:");
			  System.out.print("Linha : ");
			  linha = Integer.valueOf(teclado.nextInt());
			  System.out.print("Coluna : ");
			  coluna = Integer.valueOf(teclado.nextInt());
			  
			  linha -= 1;
			  coluna -= 1;	   
		  }while( eValida(tabuleiro,linha,coluna));
		   tabuleiro[linha][coluna] = simbolo;
	}
		
	public boolean eValida(String tabuleiro[][],int i, int j) {
		if(i <= 2 && i >= 0 && j <= 2 && j >= 0 ) {
			return false;
		
		}else if(tabuleiro[i][j] != x || tabuleiro[i][j] != o) {	
			System.out.println("Entrada Invalida, Insira outra");
			return false;
	    }else
	    	return true;
	
	}
}
