import java.util.HashSet;
import java.util.Set;

class FindStringPermutation {

    private String small;
    private String big;

    FindStringPermutation(String small, String big){
        this.small = small;
        this.big = big;
    }

    int findAllPermutationsOfSmallOnBig(){
        int i = 0;
        int permutations = 0;
        while (small.length() + i <= big.length()) {
            if (isPermutation( big.subSequence(i, small.length() + i) )) {
                permutations++;
            }
            i++;
        }
        return permutations;
    }

    private boolean isPermutation(CharSequence c){
        Set<Integer> used = new HashSet<>();
        for (int i = 0; i< c.length(); i++){
            int index = small.indexOf(c.charAt(i));
            //if small contain repeated chars
            while (used.contains(index)){
                index = small.indexOf(c.charAt(i), index+1);
            }
            if (index == -1 || used.contains(index)){
                return false;
            }
            used.add(index);
        }
        return true;
    }

}
