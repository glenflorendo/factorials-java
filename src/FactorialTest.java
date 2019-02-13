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

    @org.junit.Test
    public void factorialThree() {
        assertEquals(6, f.factorial(3));
    }

    @org.junit.Test
    public void factorialFour() {
        assertEquals(24, f.factorial(4));
    }

    @org.junit.Test
    public void factorialFive() {
        assertEquals(120, f.factorial(5));
    }

    @org.junit.Test
    public void factorialSix() { assertEquals(720, f.factorial(6)); }

    @org.junit.Test
    public void factorialSeven() { assertEquals(5040, f.factorial(7)); }

    @org.junit.Test
    public void factorialEight() {
        assertEquals(40320, f.factorial(8));
    }

    @org.junit.Test
    public void factorialNine() {
        assertEquals(362880, f.factorial(9));
    }

    @org.junit.Test
    public void factorialTen() {
        assertEquals(3628800, f.factorial(10));
    }

}
