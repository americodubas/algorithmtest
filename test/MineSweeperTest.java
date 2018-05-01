import org.junit.Test;

import static org.junit.Assert.*;

public class MineSweeperTest {

    @Test
    public void first() {
        int[][] bombs = {{0, 2}, {2, 0}};
        int[][] result = {
                {0, 1, -1},
                {1, 2, 1},
                {-1, 1, 0}};
        assertArrayEquals(result, MineSweeper.build(bombs, 3, 3));
    }

    @Test
    public void second() {
        int[][] bombs = {{0, 0}, {0, 1}, {1, 2}};
        // mineSweeper(bombs2, 3, 4) should return:
        int[][] result = {
                {-1, -1, 2, 1},
                {2, 3, -1, 1},
                {0, 1, 1, 1}};
        assertArrayEquals(result, MineSweeper.build(bombs, 3, 4));
    }

    @Test
    public void third() {
        int[][] bombs = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        int[][] result = {
                {1, 2, 2, 1, 0},
                {1, -1, -1, 2, 0},
                {1, 3, -1, 2, 0},
                {0, 1, 2, 2, 1},
                {0, 0, 1, -1, 1}};
        assertArrayEquals(result, MineSweeper.build(bombs, 5, 5));
    }
}