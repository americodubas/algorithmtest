/**
 * Rotate a square 2D Array 90º
 */
class Rotate2DArray {

    static int[][] rotate(int[][] a, int n) {
        // NOTE: To solve it in place, write this function so that you
        // won't have to create rotated.
        int[][] rotated = new int[n][n];

        int newColumn = n;
        for (int row = 0; row < n; row++) {
            newColumn--;
            for (int col = 0; col < n; col++) {
                rotated[col][newColumn] = a[row][col];
            }
        }

        return rotated;
    }

}
