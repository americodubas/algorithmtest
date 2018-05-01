import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class NonRepeatingCharacterTest {

    @Test
    public void shouldReturnC() {
        assertEquals(Character.valueOf('c'), NonRepeatingCharacter.find("abcab"));
    }

    @Test
    public void shouldReturnNull() {
        assertNull(NonRepeatingCharacter.find("abab"));
    }

    @Test
    public void shouldReturnC2() {
        assertEquals(Character.valueOf('c'), NonRepeatingCharacter.find("aabbbc"));
    }

    @Test
    public void shouldReturnD() {
        assertEquals(Character.valueOf('d'), NonRepeatingCharacter.find("aabbdbc"));
    }
}