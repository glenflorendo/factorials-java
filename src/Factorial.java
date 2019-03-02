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

    public static void main(String[] args) {

        Factorial f = new Factorial();

        // Test 0
        long startTime0 = System.nanoTime();
        f.factorial(0);
        long endTime0 = System.nanoTime();
        long duration0 = (endTime0 - startTime0); // 1000000; // get milliseconds

        // Test 1
        long startTime1 = System.nanoTime();
        f.factorial(1);
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1); // 1000000; // get milliseconds

        // Test 2
        long startTime2 = System.nanoTime();
        f.factorial(2);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2); // 1000000; // get milliseconds


        // Test 3
        long startTime3 = System.nanoTime();
        f.factorial(3);
        long endTime3 = System.nanoTime();
        long duration3 = (endTime3 - startTime3); // 1000000; // get milliseconds


        // Test 4
        long startTime4 = System.nanoTime();
        f.factorial(4);
        long endTime4 = System.nanoTime();
        long duration4 = (endTime4 - startTime4); // 1000000; // get milliseconds


        // Test 5
        long startTime5 = System.nanoTime();
        f.factorial(5);
        long endTime5 = System.nanoTime();
        long duration5 = (endTime5 - startTime5); // 1000000; // get milliseconds


        // Test 6
        long startTime6 = System.nanoTime();
        f.factorial(6);
        long endTime6 = System.nanoTime();
        long duration6 = (endTime6 - startTime6); // 1000000; // get milliseconds


        // Test 7
        long startTime7 = System.nanoTime();
        f.factorial(7);
        long endTime7 = System.nanoTime();
        long duration7 = (endTime7 - startTime7); // 1000000; // get milliseconds


        // Test 8
        long startTime8 = System.nanoTime();
        f.factorial(8);
        long endTime8 = System.nanoTime();
        long duration8 = (endTime8 - startTime8); // 1000000; // get milliseconds


        // Test 9
        long startTime9 = System.nanoTime();
        f.factorial(9);
        long endTime9 = System.nanoTime();
        long duration9 = (endTime9 - startTime9); // 1000000; // get milliseconds


        // Test 10
        long startTime10 = System.nanoTime();
        f.factorial(10);
        long endTime10 = System.nanoTime();
        long duration10 = (endTime10 - startTime10); // 1000000; // get milliseconds

        System.out.println("Test 0: " + duration0);
        System.out.println("Test 1: " + duration1);
        System.out.println("Test 2: " + duration2);
        System.out.println("Test 3: " + duration3);
        System.out.println("Test 4: " + duration4);
        System.out.println("Test 5: " + duration5);
        System.out.println("Test 6: " + duration6);
        System.out.println("Test 7: " + duration7);
        System.out.println("Test 8: " + duration8);
        System.out.println("Test 9: " + duration9);
        System.out.println("Test 10: " + duration10);
    }
}
