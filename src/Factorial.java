public class Factorial extends Thread {

    private long result;

    /**
     * Outputs the evaluation of the factorial of a given number
     *
     * @param {long} n Positive number
     * @return {long} result Factorial result
     */
    public long getFibThread(long n) {
        if (n == 0 || n == 1) {
            this.result = 1;

        } else {
            try{
                FactorialThread ft1 = new FactorialThread(1, n / 2);
                FactorialThread ft2 = new FactorialThread(n / 2 + 1, n);

                ft1.start();
                ft2.start();

                ft1.join();
                ft2.join();

                this.result = ft1.getResult() * ft2.getResult();
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        return this.result;
    }
}

class FactorialThread extends Thread {

    private long start;
    private long end;
    private long result = 1;

    FactorialThread(long start, long end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Evaluates the product of a range of numbers
     *
     * @param {long} n Positive number
     */
    public void run() {
        for (long i = this.start; i <= this.end; i++) {
            result *= i;
        }
    }

    /**
     * Outputs its stored result
     *
     * @return {long} result Factorial result
     */
    public long getResult() {
        return this.result;
    }
}
