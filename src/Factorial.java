public class Factorial {

    public static long factorial(long n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

}
