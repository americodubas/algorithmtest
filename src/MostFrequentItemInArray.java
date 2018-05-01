import javafx.util.Pair;

import java.util.HashMap;

/**
 * Find the most frequent item in the given array
 * Assume that there will always be one most frequent item
 * Try to solve in O(n)
 */
class MostFrequentItemInArray {

    static Pair<Integer, Integer> find(int[] given) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int maxCount = 0;
        int currentCount;
        int mostFrequent = 0;

        for (int i : given) {

            if (!count.containsKey(i)) {
                count.put(i, 1);
                continue;
            }

            currentCount = count.get(i);
            currentCount++;
            count.put(i, currentCount);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostFrequent = i;
            }
        }

        return new Pair<>(mostFrequent, maxCount);
    }

}
