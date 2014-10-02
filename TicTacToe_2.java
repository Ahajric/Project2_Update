//List of classes we  have imported. 
import java.util.Scanner;
/*
The main method, here we created two objects of Player and will call methods upon it.
The first input argument is Player X an the second arguement is Player O.
Possible values for first and second argument is Human,Naive, Random, and Cutthroat.  
*/
public class TicTacToe{
	
	public static void main(String args[]){

		int error = 0;
		int acceptedInput = -1;;
		int playerTurn = 1;
		int isFinished = 0;
		int movesMade = 0;
		TicTacToeBoard playingBoard = new TicTacToeBoard();
		Player playerOne;
		Player playerTwo;

		if(args[0].equalsIgnoreCase("human")){
			playerOne = new HumanPlayer();
		}
		else if(args[0].equalsIgnoreCase("random")){
			playerOne = new RandomComputerPlayer();
		}
		else if(args[0].equalsIgnoreCase("naive")){
			playerOne = new NaiveComputerPlayer();
		}
		else if(args[0].equalsIgnoreCase("cutthroat")){
			playerOne = new CutThroatComputerPlayer();
		}
		else{
			error = -1;
		}

		if(args[1].equalsIgnoreCase("human")){
			playerTwo = new HumanPlayer();
		}
		else if(args[1].equalsIgnoreCase("random")){
			playerTwo = new RandomComputerPlayer();
		}
		else if(args[1].equalsIgnoreCase("naive")){
			playerTwo = new NaiveComputerPlayer();
		}
		else if(args[1].equalsIgnoreCase("cutthroat")){
			playerTwo = new CutThroatComputerPlayer();
		}
		else{
			error = -1;
		}
		
		if(error == 0){
			System.out.println("Tic-tac-toe Game");
			
			while(isFinished == 0){				

				//Print out the board here.
				playingBoard.printBoard();
					
				do{
					if(playerTurn == 1){
						//getMove sets the private "move" variable inside the respective Player class.
						playerOne.getMove();

						//getX and getY get the slots according to X and Y based on private "move" variable.
						//setTile returns -1 if the tile is already taken and 1 if it isn't.
						acceptedInput = playingBoard.setTile(playerTurn, playerOne.getX(), playerOne.getY());
						
						movesMade++;
					}
					else{
						//getMove sets the private "move" variable inside the respective Player class.
						playerTwo.getMove();

						//getX and getY get the slots according to X and Y based on private "move" variable.
						//setTile returns -1 if the tile is already taken and 1 if it isn't.
						acceptedInput = playingBoard.setTile(playerTurn, playerTwo.getX(), playerTwo.getY());

						movesMade++;
					}
				}while(acceptedInput == -1);
	
				//switchTurn simply returns the other player's turn based on the current player's turn.
				playerTurn = playingBoard.switchTurn(playerTurn);

				//Check if game is finished.
				isFinished = playingBoard.getFinished(movesMade);
			}
		}
		else{
			System.out.println(	"The input was not accepted. Please input in the format of \"java TicTacToe" +
						"<playerType> <playerType>\" where <playerType> is any of Human, Naive, Random, or CutThroat.");
		}
	}
}
