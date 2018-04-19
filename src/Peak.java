import java.util.ArrayList;
import java.util.List;

public class Peak {

    //Divide and Conquer
    public static int find(int[] array, int begin, int end) {
        int m = (begin + end) / 2;
        List<Integer> l = new ArrayList<Integer>();
        if (m - 1 >= begin && array[m - 1] > array[m]) {
            return find(array, begin, m - 1);
        } else if (m + 1 <= end && array[m] < array[m + 1]) {
            return find(array, m + 1, end);
        } else {
            return m;
        }

    }

    //Brute force checking all values
    public static int force(int[] array){
        for (int i = 0; i < array.length; i++){
            boolean greaterThanLeft = i - 1 < 0 || array[i - 1] <= array[i];
            boolean greaterThanRight = i + 1 == array.length || array[i] >= array[i + 1];
            if (greaterThanLeft && greaterThanRight) {
                return i;
            }
        }
        return 0;
    }

}
