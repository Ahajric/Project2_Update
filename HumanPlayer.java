import java.util.Scanner;
public class HumanPlayer extends Player{
	
	Scanner keyboard = new Scanner(System.in);
	private int userInput = 0;
	public HumanPlayer(){
	    

	}

	public void getMove(){
		//Print out prompt here and scan in input
		userInput = keyboard.nextInt();
	}
   	
	public int getX(){
		if(userInput < 4 && userInput > 0){
			return 2;
		}

		else if(userInput < 7 && userInput > 3){
			return 1;
		}

		else if(userInput < 10 && userInput > 6){
			return 0;
		}
		 
	}

	public int getY(){
		if(userInput == 7 || userInput == 4 || userInput == 3){
			return 0;
		}
		else if(userInput == 8 || userInput == 5 || userInput == 2){
			return 1;
		}
		
		else if(userInput == 9 || userInput == 6 || userInput == 3 ){
			return 2;
		}

	} 
}
