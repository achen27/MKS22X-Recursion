public class QueenBoard{

  private int[][] board;

  public QueenBoard(int size){
    board = new int[size][size];
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        board[i][j] = 0;
      }
    }
  }

  private boolean addQueen(int r, int c){
    if (board[r][c] != 0){
      return false;
    } else {
      //horizontal Xs
      for (int i = c; i < board.length; i++){
        board[r][i]++;
      }
      //diagonal up
      for (int i = 0; r-i >= 0 && c+i < board.length; i++){
        board[r-i][c+i]++;
      }
      //diagonal down
      for (int i = 0; r+i < board.length && c+i < board.length; i++){
        board[r+i][c+i]++;
      }
      board[r][c] = -1;
      return true;
    }
  }

  private boolean removeQueen(int r, int c){
    if (board[r][c] != -1){
      return false;
    } else {
      //horizontal Xs
      for (int i = c; i < board.length; i++){
        board[r][i]--;
      }
      //diagonal up
      for (int i = 0; r-i >= 0 && c+i < board.length; i++){
        board[r-i][c+i]--;
      }
      //diagonal down
      for (int i = 0; r+i < board.length && c+i < board.length; i++){
        board[r+i][c+i]--;
      }
      board[r][c] = 0;
      return true;
    }
  }

  //prints out numbers
  private String debugString(){
    String s = "";
    for (int i = 0; i < board.length; i++){
      for (int j = 0; j < board.length; j++){
        if (board[i][j] == -1){
          s += board[i][j] + " ";
        } else {
          s += " " + board[i][j] + " ";
        }
      }
      s += "\n";
    }
    return s;
  }

  /**
  *@return The output string formatted as follows:
  *All numbers that represent queens are replaced with 'Q'
  *all others are displayed as underscores '_'
  *There are spaces between each symbol:
  *"""_ _ Q _
  *Q _ _ _
  *_ _ _ Q
  *_ Q _ _"""
  *(pythonic string notation for clarity,
  *excludes the character up to the *)
  */
  public String toString(){
    String s = "";
    for (int i = 0; i < board.length; i++){
      for (int j = 0; j < board.length; j++){
        if (board[i][j] == -1){
          s += "Q ";
        } else {
          s += "_ ";
        }
      }
      s += "\n";
    }
    return s;
  }

  public static void main(String[] args){

    QueenBoard b = new QueenBoard(4);
    System.out.println(b.debugString());

    b.addQueen(0,0);
    System.out.println(b.debugString());

    b.addQueen(2,1);
    System.out.println(b.debugString());

    b.removeQueen(0,0);
    System.out.println(b.debugString());

  }

}
