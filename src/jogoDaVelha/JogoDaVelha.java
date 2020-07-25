package jogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogada jogadas = new Jogada();
		FimDeJogo fimDeJogo = new FimDeJogo();

		System.out.println("=======MENU======");
		System.out.println("Digite:");
		System.out.println("[1] jogar contra maquina");
		System.out.println("[2] 2 pessoas jogarem" );
		opcao = teclado.nextInt();

		tabuleiro.limparTabuleiro(tabuleiro.tabuleiro);
		
		switch(opcao) {
		case 1:
			for(int i = 0; i < 5; i++) {
				tabuleiro.mostrarTabuleiro(tabuleiro.tabuleiro);				
				//Jogador inicia e faz 5 jogadas
				jogadas.lerJogadas(tabuleiro.tabuleiro,jogadas.linha,jogadas.coluna,"jogador 1");				
				// Computador faz 4 jogadas
				if(i<4) {
					jogadas.sorteiaJogadas(tabuleiro.tabuleiro,jogadas.linha2,jogadas.coluna2);						
				}
				if(fimDeJogo.temUmVencedor(tabuleiro.tabuleiro) == true) {
					break;
				}
			}
			break;
		case 2:
			for(int i = 0; i < 5; i++) {
				tabuleiro.mostrarTabuleiro(tabuleiro.tabuleiro);				
				//Jogador inicia e faz 5 jogadas
				jogadas.lerJogadas(tabuleiro.tabuleiro,jogadas.linha,jogadas.coluna,"jogador 1");		
				// Computador faz 4 jogadas
				tabuleiro.mostrarTabuleiro(tabuleiro.tabuleiro);
				if(fimDeJogo.temUmVencedor(tabuleiro.tabuleiro) == true) {
					break;
				}
				if(i<4) {
					jogadas.lerJogadas(tabuleiro.tabuleiro,jogadas.linha2,jogadas.coluna2,"jogador 2");							
				}
				if(fimDeJogo.temUmVencedor(tabuleiro.tabuleiro) == true) {
					break;
				}
			}
			break;
			
		default:
			System.out.println("Opcao invalida");
		}
	
		System.out.println("========RESULTADO============");
		tabuleiro.mostrarTabuleiro(tabuleiro.tabuleiro);
		System.out.println("========RESULTADO============");
		
		if(fimDeJogo.temUmVencedor(tabuleiro.tabuleiro) == false)
			System.out.println("\n  DEU VELHA");

		teclado.close();
	}
	

}

