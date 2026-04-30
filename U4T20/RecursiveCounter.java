import java.util.Set;

public class RecursiveCounter {

    public static void main(String [] args) {
        int n = 40;
        long startTime = System.nanoTime();
        int fibRec = fib(n);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        startTime = System.nanoTime();
        int fibIter = iterativeFib(n);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;
        System.out.println("Fibonacci(" + n + ")");

        System.out.println("Recursive: " + iterativeFib(n)+ " | Time: " + recursiveTime / 1e6 + " ms");
        System.out.println("Iterative: " + fib(n) + " | Time: " + iterativeTime / 1e6 + " ms");
    }

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int iterativeFib(int n){
        if (n == 1) {
            return 0;
        }
        int num = 1;
        int numBefore = 1;
        for (int i = 2; i <= n; i ++){
            int temp = num;
            num = num + numBefore;
            numBefore = temp;
        }
        return num;
    }
}