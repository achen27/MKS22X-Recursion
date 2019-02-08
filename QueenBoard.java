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

  public boolean addQueen(int r, int c){
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

  public boolean removeQueen(int r, int c){
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
  public String debugString(){
    String s = "";
    for (int i = 0; i < board.length; i++){
      for (int j = 0; j < board.length; j++){
        s += board[i][j] + " ";
      }
      s += "\n";
    }
    return s;
  }

}
