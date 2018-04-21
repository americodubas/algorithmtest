import java.util.ArrayList;
import java.util.List;

/**
 * For each item in a given array, calculate it's next state according to it's neighbours
 * The array contains only 0s and 1s
 * IF the neighbours are the same (e.g. 1 and 1 or 0 and 0) then it'll become 0 ELSE it'll become 1
 * The items outside of the array should be consider 0s
 * Change all states simultaneously
 */
class NextState {

    private static List<int[]> alreadyCalculated = new ArrayList<>();
    private static boolean foundSame = false;
    private static int i = 0;
    private static String first;

    static int[] change(int[] given, int times) {

        first = convertToString(given);
        alreadyCalculated.add(given);

        while (times > 0) {
            given = changeOneTime(given);
            times--;
        }

        return given;
    }

    private static String convertToString(int[] given) {
        StringBuilder s = new StringBuilder();
        for (int i : given) {
            s.append(i);
        }
        return s.toString();
    }

    private static int[] changeOneTime(int[] state) {
        if (foundSame){
            //After finding the first state again the pattern will repeat over and over
            i++;
            if (i >= alreadyCalculated.size()) {
                i = 0;
            }
            return alreadyCalculated.get(i);
        }

        //the builder is just for the equals
        StringBuilder s = new StringBuilder();
        //newState is just because the actual state can be changed only after the calc
        int[] newState = new int[state.length];
        calculate(state, s, newState);

        if (first.equals(s.toString())){
            foundSame = true;
        } else {
            alreadyCalculated.add(newState);
        }

        return newState;
    }

    private static void calculate(int[] given, StringBuilder s, int[] newState) {
        for (int i = 0; i < given.length; i++) {
            boolean nLeftActive = i - 1 >= 0 && given[i - 1] == 1;
            boolean nRightActive = i + 1 < given.length && given[i + 1] == 1;

            if (nLeftActive == nRightActive) {
                newState[i] = 0;
                s.append(0);
            } else {
                newState[i] = 1;
                s.append(1);
            }

        }
    }

}
