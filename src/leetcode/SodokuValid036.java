package leetcode;

import java.util.HashSet;

public class SodokuValid036 {

	public static void main(String[] args) {
		Solution036 solution =  new Solution036();
		char[][] board = {
				  {'8','3','.','.','7','.','.','.','.'},
				  {'6','.','.','1','9','5','.','.','.'},
				  {'.','9','8','.','.','.','.','6','.'},
				  {'8','.','.','.','6','.','.','.','3'},
				  {'4','.','.','8','.','3','.','.','1'},
				  {'7','.','.','.','2','.','.','.','6'},
				  {'.','6','.','.','.','.','2','8','.'},
				  {'.','.','.','4','1','9','.','.','5'},
				  {'.','.','.','.','8','.','.','7','9'}
				};
		char[][] board1 = {
		                  {'5','3','.','.','7','.','.','.','.'},
		                  {'6','.','.','1','9','5','.','.','.'},
		                  {'.','9','8','.','.','.','.','6','.'},
		                  {'8','.','.','.','6','.','.','.','3'},
		                  {'4','.','.','8','.','3','.','.','1'},
		                  {'7','.','.','.','2','.','.','.','6'},
		                  {'.','6','.','.','.','.','2','8','.'},
		                  {'.','.','.','4','1','9','.','.','5'},
		                  {'.','.','.','.','8','.','.','7','9'}
		};
        System.out.println(solution.isValidSodoku(board1));
	}

}

class Solution036 {
	public boolean isValidSodoku (char[][] board) {
		if (board==null | board.length!=9 | board[0].length!=9) return false;
		
		for (int i=0; i< board.length; i++) {
			HashSet<Character> rows = new HashSet<Character>();
			HashSet<Character> colums = new HashSet<Character>();
			HashSet<Character> cube = new HashSet<Character>();
			
			for (int j=0; j< board[0].length; j++) {
				
				System.out.println("row="+i+" colum="+j);
				//check row
				if(board[i][j]!='.' && !rows.add( board[i][j] ))  {
					
					return false;
				}
							
				if(board[j][i]!='.' && !colums.add( board[j][i] ))  {
									
					return false;
				}
				
				
				//check 3*3
				int startx=3*(i/3);
				int starty=3*(i%3);
				
				if (board[startx + j/3][starty + j%3]!='.' && !cube.add( board[startx + j/3][starty + j%3] )) {
				    return false;
				}
			}
		}
		return true;
	}
}