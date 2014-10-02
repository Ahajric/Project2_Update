public class TicTacToeBoard extends Board{

	private int[][] board = new int[3][3];

	public TicTacToeBoard(){
		
		//Initializes board to -1 for all entries.
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				board[i][j] = -1;
			}
		}
	}

	/* setTile
	 *
	 * Sets tile to the player (1 for Player 1, 2 for Player 2)
	 *  based on x coord and y coord. Returns 1 if the position
	 *  isn't filled already and -1 if it is filled.
	 *  If -1, the board is not modified.
	 *
	 */
	public int setTile(int player, int x, int y){

		if(board[x][y] == -1){
			
			board[x][y] = player;
			return 1;
		}
		else{
			return -1;
		}
	}

	public void printBoard(){
		//Prints Board.
		for(int m = 0; m < 3; m++){
			for(int n = 0; n < 2; n++){
				if(board[m][n] != -1){
					System.out.print(board[m][n] + "|");
				}
				else{
					System.out.print(" " + "|");
				}
				
			}
			System.out.println();
			
			if(m < 2){
				System.out.println("-----");
			}
		}
	}

	public int switchPlayer(int playerTurn){
		if(playerTurn == 1){
			return 2;
		}
		else if(playerTurn == 2){
			return 1;
		}
		else{
			System.out.println("Usage of switchPlayer(int playerTurn) is that it accepts the player turn and returns the other players'. Only accepts 1 or 2.");
		}
	}

	//Checks if the game is finished. Returns player value.
	public int getFinished(){
		return 0;
	}
}
