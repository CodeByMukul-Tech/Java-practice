import java.util.*;

public class sudoku {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] board = new char[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        board[i][j] = sc.next().charAt(0);
      }
    }
    sc.close();
    if (isValidSudoku(board)) {
      System.out.println("correct");
    } else {
      System.out.println("incorrect");
    }
  }

  public static boolean isValidSudoku(char[][] board) {
    
    // your code here
  }
}