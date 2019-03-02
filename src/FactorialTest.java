import static org.junit.Assert.*;

public class FactorialTest {

    private Factorial f = new Factorial();

    @org.junit.Test
    public void factorialZero() {
        assertEquals(1, f.getFibThread(0));
    }

    @org.junit.Test
    public void factorialOne() {
        assertEquals(1, f.getFibThread(1));
    }

    @org.junit.Test
    public void factorialTwo() {
        assertEquals(2, f.getFibThread(2));
    }

    @org.junit.Test
    public void factorialThree() {
        assertEquals(6, f.getFibThread(3));
    }

    @org.junit.Test
    public void factorialFour() {
        assertEquals(24, f.getFibThread(4));
    }

    @org.junit.Test
    public void factorialFive() {
        assertEquals(120, f.getFibThread(5));
    }

    @org.junit.Test
    public void factorialSix() { assertEquals(720, f.getFibThread(6)); }

    @org.junit.Test
    public void factorialSeven() { assertEquals(5040, f.getFibThread(7)); }

    @org.junit.Test
    public void factorialEight() {
        assertEquals(40320, f.getFibThread(8));
    }

    @org.junit.Test
    public void factorialNine() {
        assertEquals(362880, f.getFibThread(9));
    }

    @org.junit.Test
    public void factorialTen() {
        assertEquals(3628800, f.getFibThread(10));
    }

}
