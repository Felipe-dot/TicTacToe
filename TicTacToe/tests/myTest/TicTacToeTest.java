package myTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import myGame.Coordenada;
import myGame.Tabuleiro;

public class TicTacToeTest {

	/**
	 * Verificar se possuo um tabuleiro
	 * Se o tabuleiro está vazio
	 * Verificar se tenho 2 jogadores
	 * Verificar o simbolo escolhido
	 * Testar ganhadores nas diagonais
	 * Testar ganahdores nas linhas
	 * Se a jogada é valida
	 * 
	 *
	 */
	
	@Test
	public void testVerificarSeTenhoUmTabuleiro() {
		Tabuleiro tab = new Tabuleiro();
		
		boolean resultado = tab.getTabuleiro() != null;
		System.out.println(resultado);
		
		assertTrue(resultado);
	}
	
	@Test
	public void testSeOTabuleiroEstaVazio() {
		//OBS NÃO FUNCIONA COMO O ESPERADO
		Tabuleiro tab = new Tabuleiro();
		
		String mat[][] = new String[3][3];
			
		boolean resultado = tab.getTabuleiro() != mat;
		System.out.println(resultado);
		
		assertTrue(resultado);
	}
	
	@Test
	public void testSeTemJogadores() {
		Tabuleiro tab = new Tabuleiro();
		tab.setJogador1("Jogador Um", null);
		tab.setJogador2("Jogador Dois", null);
		
		boolean resultado = tab.getJogadores(tab.getJogador1(),tab.getJogador2());
	
		System.out.println(resultado);
		assertTrue(resultado);
	}
	
	@Test
	public void testVerificarOSimboloEscolhidos() {
		Tabuleiro tab = new Tabuleiro();
		tab.setJogador1("Jogador Um", "X");
		tab.setJogador2("jogador Dois","O");
		
		boolean resultado = tab.getSimbolos(tab.getJogador1(),tab.getJogador2());
		System.out.println(resultado);
		
		assertTrue(resultado);
	}
	
	@Test
	public void testVerificarSeAjogadaEValida() {
		Tabuleiro tab = new Tabuleiro();
		tab.setLinha(2);
		tab.setColuna(0);
		
		boolean resultado = tab.eValida(tab.getLinha(), tab.getColuna());
		System.out.println(resultado);
		
		assertTrue(resultado);
	}	
	
	@Test
	public void testTemGanhadorNasLinhas() {
		Tabuleiro tab = new Tabuleiro();
		Coordenada cord = new Coordenada();
		
		cord.setLinha(0);
		cord.setColuna(0);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
		
		cord.setLinha(1);
		cord.setColuna(1);
		tab.setJogada2(cord);
		tab.atribuiJogadaO(tab.getTabuleiro(), tab.getJogada2());
		
		cord.setLinha(0);
		cord.setColuna(1);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
		
		cord.setLinha(2);
		cord.setColuna(2);
		tab.setJogada2(cord);
		tab.atribuiJogadaO(tab.getTabuleiro(), tab.getJogada2());
		
		cord.setLinha(0);
		cord.setColuna(2);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
	
		boolean resultado = tab.ganhadorLinha(tab.getTabuleiro());
		
		System.out.println(resultado);
		
		assertTrue(resultado);
	}
	
	@Test
	public void testTemGanhadorNasColunas() {
		Tabuleiro tab = new Tabuleiro();
		Coordenada cord = new Coordenada();
		
		cord.setLinha(0);
		cord.setColuna(0);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
		
		cord.setLinha(1);
		cord.setColuna(1);
		tab.setJogada2(cord);
		tab.atribuiJogadaO(tab.getTabuleiro(), tab.getJogada2());
		
		cord.setLinha(1);
		cord.setColuna(0);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
		
		cord.setLinha(2);
		cord.setColuna(2);
		tab.setJogada2(cord);
		tab.atribuiJogadaO(tab.getTabuleiro(), tab.getJogada2());
		
		cord.setLinha(2);
		cord.setColuna(0);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
		
		boolean resultado = tab.ganhadorColuna(tab.getTabuleiro());
		System.out.println(resultado);
		
		assertTrue(resultado);
	}
	
	@Test
	public void testTemGanhadorNasDiagonalPrincipal() {
		Tabuleiro tab = new Tabuleiro();
		Coordenada cord = new Coordenada();
		
		cord.setLinha(0);
		cord.setColuna(0);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
		
		cord.setLinha(2);
		cord.setColuna(0);
		tab.setJogada2(cord);
		tab.atribuiJogadaO(tab.getTabuleiro(), tab.getJogada2());
		
		cord.setLinha(1);
		cord.setColuna(1);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
		
		cord.setLinha(0);
		cord.setColuna(1);
		tab.setJogada2(cord);
		tab.atribuiJogadaO(tab.getTabuleiro(), tab.getJogada2());
		
		cord.setLinha(2);
		cord.setColuna(2);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
		
		boolean resultado = tab.ganhadorDiagonais(tab.getTabuleiro());
		System.out.println(resultado);
		
		assertTrue(resultado);
		
	}
	
	@Test
	public void testTemGanhadorNasDiagonalSecundaria() {
		Tabuleiro tab = new Tabuleiro();
		Coordenada cord = new Coordenada();
		
		cord.setLinha(2);
		cord.setColuna(0);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
		
		cord.setLinha(1);
		cord.setColuna(0);
		tab.setJogada2(cord);
		tab.atribuiJogadaO(tab.getTabuleiro(), tab.getJogada2());
		
		cord.setLinha(1);
		cord.setColuna(1);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
		
		cord.setLinha(2);
		cord.setColuna(1);
		tab.setJogada2(cord);
		tab.atribuiJogadaO(tab.getTabuleiro(), tab.getJogada2());
		
		cord.setLinha(0);
		cord.setColuna(2);
		tab.setJogada1(cord);
		tab.atribuiJogadaX(tab.getTabuleiro(), tab.getJogada1());
		
		boolean resultado = tab.ganhadorDiagonais(tab.getTabuleiro());
		System.out.println(resultado);
		
		assertTrue(resultado);
		
	}
	
}
