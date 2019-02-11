import static org.junit.Assert.*;

public class FactorialTest {

    private Factorial f = new Factorial();

    @org.junit.Test
    public void factorialZero() {
        assertEquals(1, f.factorial(0));
    }

    @org.junit.Test
    public void factorialOne() {
        assertEquals(1, f.factorial(1));
    }

    @org.junit.Test
    public void factorialTwo() {
        assertEquals(2, f.factorial(2));
    }

}
