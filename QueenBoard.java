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
      board[r][c] = -1;
      //horizontal Xs
      for (int i = c; i < board.length; i++){
        board[r][i] += 1;
      }
      //diagonal up
      return true;
    }
  }

}
