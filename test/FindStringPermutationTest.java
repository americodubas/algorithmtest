import org.junit.Test;

import static org.junit.Assert.*;

public class FindStringPermutationTest {

    @Test
    public void findAllPermutationsOfSmallOnBig() {
        FindStringPermutation f = new FindStringPermutation("abbc", "cbabadcbbabbcbabaabccbabc");
        assertEquals(7, f.findAllPermutationsOfSmallOnBig());
    }
}