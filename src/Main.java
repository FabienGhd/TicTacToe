import java.util.Scanner;

public class Main {
	
	public static boolean isDigit(int num) {
		for(int i = 0; i < 10; i++) {
			if(num == i) {
				return true;
			}
		} return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		TicTacToe game = new TicTacToe();
		
		game.initializeBoard();
		
		String player = "X";
		boolean isCorrect = false;
		boolean errorDetected = false;	
		
	
		do {
			System.out.println(game.printBoard());
			
				//rows
				System.out.println("Enter coordinates for rows: ");
				int i = sc.nextInt();
				
				//managing errors
				while(!isCorrect) {
				if(i < 0 || i > 2) {
					errorDetected = true;
					
					System.out.println("The board ranges from row 0 to row 2! Please pick a number that fits the board (0, 1 or 2): ");
					i = sc.nextInt();
	
				} else {
					isCorrect = true;
				}
				} //end while loop
				
				if(errorDetected) {
					System.out.println("Much better!");
				}
				isCorrect = false;
				errorDetected = false;
				
				//columns
				System.out.println("Enter coordinates for columns: ");
				int j = sc.nextInt();
				
				//managing errors 
				while(!isCorrect) {
				if(j < 0 || j > 2) {
					errorDetected = true;
					System.out.println("The board ranges from column 0 to column 2! Please pick a number that fits the board (0, 1 or 2): ");
					i = sc.nextInt();
				} else {
					isCorrect = true;
				}
				} //end while loop
				
				if(errorDetected) {
					System.out.println("Much better!");
				}
				isCorrect = false;
				errorDetected = false;
				
				game.setPlay(i, j, player);
				
				if(game.isGamerOver()) {
					System.out.println(game.printBoard() + "\n" + "The player with the following mark: " + player + ", won the game!");
					break;
				}
				
			//change the player
			if(player == "X") {
				player = "O";
			} else {
				player = "X";
			}
			
		}while(true);
	}

	}


