import org.junit.Test;
/**
 * Created by ArtistQiu on 2017/6/4.
 */
public class MyLifeGameTest {

    @Test
    public void imitate_a_simple_board(){
        // 模拟新建一个简单培养皿，01输出。
        int[][] board = {
                {1,1,0,0},
                {1,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };
        PetriDish.print(board); // Petri Dish 培养皿。
    }

    @Test
    public void imitate_cell(){
        // 新建一个Cell类。
        int[][] board = {
                {1,1,1,0},
                {1,1,0,0},
                {1,0,0,0},
                {0,0,0,0}
        };
        int row = 1;
        int column = 1;
        CellUnit cellUnit = new CellUnit(board, row, column);
        cellUnit.print();
    }
}
