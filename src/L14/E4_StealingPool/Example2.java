package L14.E4_StealingPool;

import java.util.concurrent.ForkJoinPool;

public class Example2 {
    public static void main(String[] args) {
        long res;
        long t1;
        long t2;


        // MT
        t1 = System.currentTimeMillis();

        ForkJoinPool pool = new ForkJoinPool();
        Fibonacci fb = new Fibonacci(40);

        pool.invoke(fb);
        res = fb.getRawResult();

        t2 = System.currentTimeMillis();
        System.out.println("Time in fork join= " + (t2- t1)+" ms. Result: " + res);

        // Single thread
        t1 = System.currentTimeMillis();

        res = fibonacci(40);

        t2 = System.currentTimeMillis();
        System.out.println("Time in standard = " + (t2- t1)+" ms. Result: " + res);

    }

    private static int fibonacci(int n){
        if (n <= 1){
            return n;
        }else{
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
}
