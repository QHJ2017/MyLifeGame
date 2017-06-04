/**
 * Created by ArtistQiu on 2017/6/4.
 * 这个类用来模拟培养皿。
 */
public class PetriDish {
    public static void print(int[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
