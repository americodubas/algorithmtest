import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayTest {

    @Test
    public void first() {
        assertTrue(OneAway.of("abcde", "abcd"));
    }

    @Test
    public void second() {
        assertTrue(OneAway.of("abde", "abcde"));
    }

    @Test
    public void third() {
        assertTrue(OneAway.of("a", "a"));
    }

    @Test
    public void fourth() {
        assertTrue(OneAway.of("abcdef", "abqdef"));
    }

    @Test
    public void fifth() {
        assertTrue(OneAway.of("abcdef", "abccef"));
    }

    @Test
    public void sixth() {
        assertTrue(OneAway.of("abcdef", "abcde"));
    }

    @Test
    public void seventh() {
        assertFalse(OneAway.of("aaa", "abc"));
    }

    @Test
    public void eighth() {
        assertFalse(OneAway.of("abcde", "abc"));
    }

    @Test
    public void ninth() {
        assertFalse(OneAway.of("abc", "abcde"));
    }

    @Test
    public void tenth() {
        assertFalse(OneAway.of("abc", "bcc"));
    }

}