package jogoDaVelha;

public class EndGame {

	// Verifica se já temos um ganhador
	
	public boolean isWinner(String tabuleta[][]) {
		
	    final String x = "X";
		final String o = "O";
		int point = 0;
		
		//# Verifica ganhador por linha
		for(int a = 0; a < 3; a++) {
			if(tabuleta[a][0] == x && tabuleta[a][1] == x && tabuleta[a][2] == x) {
				point = 3;
			}else if (tabuleta[a][0] == o && tabuleta[a][1] == o && tabuleta[a][2] == o) {
				point = 3;			
			}
		}
		
		//# Verifica ganhador por coluna
		for(int a = 0; a < 3; a++) {
			if(tabuleta[0][a] == x && tabuleta[1][a] == x && tabuleta[2][a] == x) {
				point = 3;
			}else if (tabuleta[0][a] == o && tabuleta[1][a] == o && tabuleta[2][a] == o) {
				point = 3;
			}
		}
		
		//# Verifica ganhador nas diagonais
			if(tabuleta[0][0] == x && tabuleta[1][1] == x && tabuleta[2][2] == x) {
				point = 3;
			}else if(tabuleta[0][0] == o && tabuleta[1][1] == o && tabuleta[2][2] == o) {
				point = 3;
			}
		
			if(tabuleta[2][1] == x && tabuleta[1][1] == x && tabuleta[0][2] == x) {
				point = 3;
			}else if(tabuleta[2][1] == o && tabuleta[1][1] == o && tabuleta[0][2] == o){
				point = 3;
			}

		if(point == 3)
			return true;
		else
			return false;		
	}
}
