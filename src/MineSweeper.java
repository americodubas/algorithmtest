/**
 * Receive bombs locations on a two-dimensional array, and the size of rows and columns
 * Fill the numbers on the array with according to bombs next to it
 */
class MineSweeper {

    /**
     * Create a field of the size of the given rows and columns
     * Put the bombs into it
     * And put the numbers of nearby bombs on it's neighbours
     * @param bombs given bombs places
     * @param numRows rows in the field
     * @param numCols columns in the field
     * @return filled field
     */
    static int[][] build(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];
        fillBombsPlaces(bombs, field);
        return field;
    }

    /**
     * Fill bombs' place with -1
     * @param bombs will always have 2 Integers inside, the row and column of the bomb
     * @param field the field in which the bombs will be put
     */
    private static void fillBombsPlaces(int[][] bombs, int[][] field) {
        for (int[] i : bombs) {
            field[i[0]][i[1]] = -1;
            sumOneToNeighbours(i[0], i[1], field);
        }
    }

    /**
     * Sum one to bomb's neighbours
     * @param bombRow row of the bomb
     * @param bombColumn column of the bomb
     * @param field given field
     */
    private static void sumOneToNeighbours(int bombRow, int bombColumn, int[][] field) {
        //search from bombRow - 1 till bombRow + 1
        for (int row = bombRow - 1; row <= bombRow + 1; row++) {
            if (row < 0 || row >= field.length ){
                //out of the field
                continue;
            }
            //search from bombColumn - 1 till bombColumn + 1 in each row
            for (int col = bombColumn - 1; col <= bombColumn + 1; col++) {
                if (col < 0 || col >= field[row].length){
                    //out of the field
                    continue;
                }
                if (field[row][col] != -1) {
                    //if not a bomb sum + 1
                    field[row][col]++;
                }
            }
        }
    }

}
