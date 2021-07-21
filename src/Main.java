import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TicTacToe game = new TicTacToe();
		game.initializeBoard();
		System.out.println(game.printBoard());
		
	}

}
