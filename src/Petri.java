/**
 * Created by ArtistQiu on 2017/6/4.
 */
public class Petri {
    private int[][] petri;

    public Petri(int size) {
        petri = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                petri[row][column] = (int) (Math.random() * 10) % 2;
            }
        }
    }

    public void print() {
        for (int row = 0; row < petri.length; row++) {
            for (int column = 0; column < petri.length; column++) {
                System.out.print(petri[row][column] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 根据CellUnit边上的八个细胞，来决定核细胞的生死。
     * 这里有个问题需要注意，更新之后不能立刻改变原培养皿状态，因为每一个细胞都要对周边的细胞产生影响。
     */
    public void update() {
        int[][] petri_temp = new int[petri.length][petri.length];
        for (int row = 0; row < petri.length; row++) {
            for (int column = 0; column < petri.length; column++) {
                CellUnit cellUnit = new CellUnit(petri, row, column);
                petri_temp[row][column] = cellUnit.update();
            }
        }
        petri = petri_temp;
        System.out.println();
    }

    /**
     * 打印二维数组。
     *
     * @param board 模拟培养皿的二维数组。
     */
    public static void print(int[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
