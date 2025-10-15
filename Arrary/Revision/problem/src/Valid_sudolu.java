import java.util.*;

public class Valid_sudolu {

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
    HashSet<Character> rowset = new HashSet<>();
    for (int i = 0; i <= 9; i++) {
      for (int j = 0; j <= 9; j++) {
        char c = board[i][j];
        if (c != '.') {
          if (rowset.contains(c)) {
            return false;
          }
          rowset.add(c);
        }
      }
    }

    HashSet<Character> colset = new HashSet<>();
    for (int j = 0; j <= 9; j++) {
      for (int i = 0; i <= 9; i++) {
        char c = board[i][j];
        if (c != '.') {
          if (colset.contains(c)) {
            return false;
          }
          colset.add(c);
        }
      }
    }

    for (int start = 0; start < 9; start += 3) {
      for (int end = 0; end < 9; end += 3) {
        if (!checksum3X3(board, start, end)) {
          return false;
        }
      }
    }

    return true;
   
  }

  public static boolean checksum3X3(char[][] board, int start, int end) {
    HashSet<Character> borw = new HashSet<>();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        char c = board[start+i][end+j];
        if(c != '.'){
          if(borw.contains(c))return false;
          borw.add(c);
          
        }

      }
    }

    return true;
  }
}