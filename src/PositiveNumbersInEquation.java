import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Print all positive integer solutions to the equation a3 + b3 = c3 + d3
 * Where a, b, c and d are integers between 1 and 100
 */
public class PositiveNumbersInEquation {


    public static void main(String[] args) {
        int n = 100;
        int result;
        Map<Integer, List< Pair<Integer, Integer> > > results = new HashMap<>();
        List< Pair<Integer, Integer> > pairs;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                result = p3(a) + p3(b);
                pairs = results.get(result);
                if (pairs == null) {
                    pairs = new ArrayList<>();
                }
                pairs.add(new Pair<>(a, b));
                results.put(result, pairs);
            }
        }

        results.forEach( (r, l) -> l.forEach(p ->  System.out.println("Pair: " + p.getKey() + " + " + p.getValue() + " Sum: " + r)));

    }

    //Run through all values
    public static void brute(String[] args) {

        int n = 100;

        for (int a = 1; a < n; a++){
            for (int b = 1; b < n; b++){
                for (int c = 1; c < n; c++){
                    //d loop can be removed with a calc
                    for (int d = 1; d < n; d++){
                        if ( p3(a) + p3(b) == p3(c) + p3(d)){
                            System.out.println("a:" + a + " b:" + b + " c:" + c + " d:" + d);
                            break;
                        }
                    }
                }
            }
        }

    }

    private static int p3(int i) {
        return (int) Math.pow(i,3);
    }

}
