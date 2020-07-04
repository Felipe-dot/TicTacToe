package myGame;

public class FimDeJogo {

	final String x = "X";
	final String o = "O";

	public boolean ganhadorLinha(String[][] tabuleta) {	
		for(int a = 0; a < 3; a++) {
			if(tabuleta[a][0] == x && tabuleta[a][1] == x && tabuleta[a][2] == x) {
				return true;
			}else if (tabuleta[a][0] == o && tabuleta[a][1] == o && tabuleta[a][2] == o) {
				return true;		
			}
		}
		return false;
	}

	public boolean ganhadorColuna(String[][] tabuleta) {
		for(int a = 0; a < 3; a++) {
			if(tabuleta[0][a] == x && tabuleta[1][a] == x && tabuleta[2][a] == x) {
				return true;
			}else if (tabuleta[0][a] == o && tabuleta[1][a] == o && tabuleta[2][a] == o) {
				return true;
			}
		}
		return false;
	}
	
	public boolean ganhadorDiagonais(String[][] tabuleta) {
		if(tabuleta[0][0] == x && tabuleta[1][1] == x && tabuleta[2][2] == x) {
			return true;
		}else if(tabuleta[0][0] == o && tabuleta[1][1] == o && tabuleta[2][2] == o) {
			return true;
		}
	
		if(tabuleta[2][0] == x && tabuleta[1][1] == x && tabuleta[0][2] == x) {
			return true;
		}else if(tabuleta[2][0] == o && tabuleta[1][1] == o && tabuleta[0][2] == o){
			return true;
		}
		
		return false;
	}
	
}
