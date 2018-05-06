import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MineSweeperExpandTest {

    private int[][] field1;
    private int[][] field2;


    @Before
    public void init() {
        field1 = new int[][]{{0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 1, -1, 1, 0}};

        field2 = new int[][] {{-1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 1, -1}};
    }

    @Test
    public void field1ClickOnNumber() {
        assertArrayEquals(field1, MineSweeperExpand.click(field1, 2, 2));
    }

    @Test
    public void field1ClickOnZero() {
        int[][] result = new int[][] {{-2, -2, -2, -2, -2},
                {-2, 1, 1, 1, -2},
                {-2, 1, -1, 1, -2}};
        assertArrayEquals(result, MineSweeperExpand.click(field1, 1, 4));
    }

    @Test
    public void field2ClickOnBomb() {
        assertArrayEquals(field2, MineSweeperExpand.click(field2, 0,0));
    }

    @Test
    public void field2ClickOnZero() {
        int[][] result = new int[][] {
                {-1, 1, -2, -2},
                {1, 1, -2, -2},
                {-2, -2, 1, 1},
                {-2, -2, 1, -1}
        };
        assertArrayEquals(result, MineSweeperExpand.click(field2, 1,3));
    }
}