/**
 *  O que irei precisar para o jogo da velha
 * 
 * # Ter uma tabuleiro [3][3]
 * # Imprimir o tabuleiro
 * # Ler a jogada do usu�rio em coordenadas
 * # Verificar se a jogada � v�lida
 * # Usar um random para a maquina realizar uma jogada
 * # Verificar se a jogada � v�lida
 * # Verificar o tabuleiro, se tiver um ganhador encerra sen�o
 * # Repete todos os passos at� atingir o m�ximo de 9  jogadas
 * 
 */

package jogoDaVelha;

public class JogoDaVelha {
	
	public static void main(String[] args) {
	
		Tabuleiro partida = new Tabuleiro();
		Jogada jogue = new Jogada();
		EndGame isEnd = new EndGame();
		
		partida.resetTabuleiro(partida.tabuleiro);
		
		for(int i = 0; i < 5; i++) {
				partida.showTabuleiro(partida.tabuleiro);				
			//Jogador inicia e faz 5 jogadas
				jogue.lerJogadas(partida.tabuleiro,partida.linha,partida.coluna);				
			// Computador faz 4 jogadas
			if(i<4) {
				jogue.sorteiaJogadas(partida.tabuleiro,partida.linhaPc,partida.colunaPc);						
			}
			if(isEnd.isWinner(partida.tabuleiro) == true) {
				break;
			}
		}
		
		System.out.println("========RESULTADO============");
		partida.showTabuleiro(partida.tabuleiro);
		System.out.println("========RESULTADO============");
		
		if(isEnd.isWinner(partida.tabuleiro) == true) {
			System.out.println("Alguem ganhou");
		}else
			System.out.println("Ninguem ganhou");
		
	}
}
