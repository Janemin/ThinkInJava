package chapter.fourth.controlling.execution.exercise;

/**
 * Created by Jane on 2018/5/1.
 */
public class E09_Fibonacci {
    static int fib(int n) {
        if (n <= 2)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        // Get the max value from the command line:
        int n = Integer.parseInt(args[0]);
        if(n < 0) {
            System.out.println("Cannot use negative numbers");
            return;
        }
        for(int i = 1; i <= n; i++) {
            System.out.print(fib(i) + ", ");
        }
    }
    /*1, 1, 2, 3, 5, 8, 13, 21, 34, 55, */
}
