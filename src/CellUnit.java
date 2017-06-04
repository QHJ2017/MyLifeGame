/**
 * Created by ArtistQiu on 2017/6/4.
 */
public class CellUnit {
    int left_up = 0;
    int up = 0;
    int right_up = 0;
    int left = 0;
    int core = 0;
    int right = 0;
    int left_down = 0;
    int down = 0;
    int getRight_down = 0;

    public CellUnit(int[][] board, int row, int column) {
        left_up = row - 1 >= 0 && column - 1 >= 0 ? board[row - 1][column - 1] : 0;
        up = row - 1 >= 0 ? board[row - 1][column] : 0;
        right_up = row - 1 >= 0 && column + 1 < board.length ? board[row - 1][column + 1] : 0;
        left = column - 1 >= 0 ? board[row][column - 1] : 0;
        core = board[row][column];
        right = column + 1 < board.length ? board[row][column + 1] : 0;
        left_down = row + 1 < board.length && column - 1 >= 0 ? board[row + 1][column - 1] : 0;
        down = row + 1 < board.length ? board[row + 1][column] : 0;
        getRight_down = row + 1 < board.length && column + 1 < board.length ? board[row + 1][column + 1] : 0;
    }

    public void print() {
        System.out.print(left_up + " ");
        System.out.print(up + " ");
        System.out.println(right_up);
        System.out.print(left + " ");
        System.out.print(core + " ");
        System.out.println(right);
        System.out.print(left_down + " ");
        System.out.print(down + " ");
        System.out.println(getRight_down);
    }
}
