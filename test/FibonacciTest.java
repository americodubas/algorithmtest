import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fib5() {
        assertEquals(5, Fibonacci.get(5));
    }

    @Test
    public void fib30() {
        assertEquals(832040 , Fibonacci.get(30));
    }

    @Test
    public void fib50() {
        assertEquals(12586269025L , Fibonacci.get(50));
    }

}