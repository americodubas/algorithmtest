/**
 * See if one array is a rotation of another one
 * Assume that they don't have duplicates
 */
class IsRotation {

    static boolean of(int[] givenOne, int [] givenTwo) {

        if (givenOne.length != givenTwo.length) {
            return false;
        }

        int i = 0, j = 0;

        //put j in the first position of givenOne[i]
        while (j < givenTwo.length) {
            if (givenOne[i] == givenTwo[j]){
                break;
            }
            j++;
        }

        //didn't find givenOne[i] on givenTwo, so it's not a rotation
        if (j == givenTwo.length){
            return false;
        }

        //loop givenOne see if givenOne[i] == givenTwo[j] till the end
        while (i < givenOne.length) {
            if (givenOne[i] == givenTwo[j]) {
                i++;
                j++;
                if (j == givenTwo.length) {
                    j = 0;
                }
            } else {
                return false;
            }
        }

        return true;
    }

}
