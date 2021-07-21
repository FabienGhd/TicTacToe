import java.util.Scanner;

public class TicTacToe {
	private String[][] board;
	private static final int rows = 3;
	private static final int cols = 3; 
	/*
	 * 'private' means you can only access it inside this class
	 * 'final' is used to define an entity that can only be assigned once
	 */
	
	public TicTacToe() {
		//instantiate the board
		board = new String[rows][cols];
	}
	
	public void initializeBoard() {
		//set the board to all empty squares
		
	}
}