package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;

public class Jogada {
	
	Random gerador = new Random();
	Scanner teclado = new Scanner(System.in);
	
	final String x = "X";
	final String o = "O";
	
	
	public void lerJogadas(String tabuleiro[][],int linha, int coluna) {
	  do {
		  System.out.println("Faça uma jogada:");
		  System.out.print("Linha : ");
		  linha = Integer.valueOf(teclado.nextInt());
		  System.out.print("Coluna : ");
		  coluna = Integer.valueOf(teclado.nextInt());
		  
		  linha -= 1;
		  coluna -= 1;	   
	  }while( isValida(tabuleiro,linha,coluna));
	   tabuleiro[linha][coluna] = x;
	}
	
	public void sorteiaJogadas(String tabuleiro[][],int linhaPc, int colunaPc) {
		do {
			linhaPc = gerador.nextInt(3);
			colunaPc = gerador.nextInt(3);	
		}while(isValida(tabuleiro,linhaPc,colunaPc));
		tabuleiro[linhaPc][colunaPc] = o; 
	}
	
	private boolean isValida(String tabuleiro[][], int l, int c) {
			
		if(l>2||l <0 || c>2 || c<0 ) {
			System.out.println("Entrada Invalida, Insira outra");
			return true;
		}
		
		if(tabuleiro[l][c] == x || tabuleiro[l][c] == o) {	
			System.out.println("Entrada Invalida, Insira outra");
			return true;
	    }else
	    	return false;
	}
	
}