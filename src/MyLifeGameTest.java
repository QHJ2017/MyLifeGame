import org.junit.Test;

/**
 * Created by ArtistQiu on 2017/6/4.
 */
public class MyLifeGameTest {

    @Test
    public void imitate_a_simple_board() {
        // 模拟新建一个简单培养皿，01输出。
        int[][] board = {
                {1, 1, 0, 0},
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        Petri.print(board); // Petri Dish 培养皿。
    }

    @Test
    public void imitate_cell() {
        // 新建一个Cell类。
        int[][] board = {
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {1, 0, 0, 0},
                {0, 0, 0, 0}
        };
        int row = 1;
        int column = 1;
        CellUnit cellUnit = new CellUnit(board, row, column);
        cellUnit.print();
    }

    @Test
    public void loop_print_cell() {
        // 新建一个培养皿，依次输出细胞当前周边状态。
        int[][] board = {
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 0, 1, 0}
        };
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                CellUnit.print(board, row, column);
                System.out.println();
            }
        }
    }

    @Test
    public void new_random_size_petri() {
        // 随即自动绘制大小指定的培养皿。
        Petri petri = new Petri(10);
        petri.print();
    }

    @Test
    public void update_petri() {
        // 更新培养皿。
        Petri petri = new Petri(10);
        petri.print();
        petri.update();
        petri.print();
    }

    @Test
    public void loop_petri() {
        // 循环更新培养皿10次。
        Petri petri = new Petri(10);
        for (int times = 0; times < 10; times++) {
            System.out.println();
            System.out.println("第" + times + "次:");
            petri.update();
            petri.print();
        }
    }
}
