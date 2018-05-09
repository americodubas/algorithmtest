import javafx.util.Pair;

import java.util.ArrayDeque;

/**
 * Implement a function that turns revealed cells into -2 given a location the user wants to click
 *
 * For simplicity, only reveal cells that have 0 in them.
 * If the user clicks on any other type of cell (for example -1 / bomb or 1, 2 or 3),
 * just ignore the click and return the original field.
 * If a user clicks 0, reveal all other 0's that are connected to it.
 */
class MineSweeperExpand {

    /**
     * Solution with recursion
     * @param field -> field with bombs and numbers
     * @param givenI -> row clicked
     * @param givenJ -> column clicked
     * @return result field
     */
    static int[][] click(int[][] field, int givenI, int givenJ) {
        
        if (field[givenI][givenJ] > 0) {
            return field;
        }
        
        turnNeighboursZeroToMinusTwo(givenI, givenJ, field);
        
        return field;
    }

    private static void turnNeighboursZeroToMinusTwo(int givenI, int givenJ, int[][] field) {

        for (int row = givenI - 1; row <= givenI + 1; row++) {
            if (row < 0 || row >= field.length) {
                //out of the field
                continue;
            }

            for (int col = givenJ - 1; col <= givenJ + 1; col++) {
                if (col < 0 || col >= field[row].length) {
                    //out of the field
                    continue;
                }
                if (field[row][col] == 0) {
                    field[row][col] = -2;
                    turnNeighboursZeroToMinusTwo(row, col, field);
                }
            }

        }

    }

    /**
     * Solution with queue
     * @param field -> field with bombs and numbers
     * @param givenI -> row clicked
     * @param givenJ -> column clicked
     * @return result field
     */
    static int[][] clickWithQueue(int[][] field, int givenI, int givenJ) {

        if (field[givenI][givenJ] > 0) {
            return field;
        }

        ArrayDeque<int[]> toCheck = new ArrayDeque<>();
        field[givenI][givenJ] = -2;
        toCheck.add(new int[]{givenI, givenJ});

        checkNeighbours(field, toCheck);

        return field;
    }

    private static void checkNeighbours(int[][] field, ArrayDeque<int[]> toCheck) {
        while ( !toCheck.isEmpty() ) {
            int[] coordinate =  toCheck.remove();

            for (int row = coordinate[0] - 1; row <= coordinate[0] + 1; row++) {
                if (row < 0 || row >= field.length) {
                    //out of the field
                    continue;
                }

                for (int col = coordinate[1] - 1; col <= coordinate[1] + 1; col++) {
                    if (col < 0 || col >= field[row].length) {
                        //out of the field
                        continue;
                    }
                    if (field[row][col] == 0) {
                        field[row][col] = -2;
                        toCheck.add(new int[]{row, col});
                    }
                }

            }

        }
    }

}
