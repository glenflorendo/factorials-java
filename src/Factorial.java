public class Factorial {

    /*
    * The factorial method outputs the evaluation of the factorial of a given number.
    *
    * The function has a runtime complexity of O(n), since it recursively evaluates
    * n number of times.
    *
    * @param {long} n Positive number
    * @returns {long} Factorial
    */
    public static long factorial(long n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

}
