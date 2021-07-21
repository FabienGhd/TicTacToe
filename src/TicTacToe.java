
public class TicTacToe {
	private String[][] board;
	private static final int rows = 3;
	private static final int cols = 3; 
	private static final String empty = "   ";
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
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				board[i][j] = empty; //3 empty spaces
			}
		}
	}
	
	public String printBoard() {
		String strBoard = "";
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				
				if(j != cols - 1) { //if we don't want the extra pipe
					strBoard += board[i][j] + "|";
				} else {
					strBoard += board[i][j];
				}
			}
			if(i != rows - 1) { //if we don't want the line at the bottom
				strBoard += "\n---+---+---\n";
			}
		}
		return strBoard;
	}
	
	public boolean isGamerOver() {
		
		//draw
		return false;
	}
	//logic of the game
	public void setPlay(int i, int j, String player) {
		
	}
}
