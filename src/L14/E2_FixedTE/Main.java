package L14.E2_FixedTE;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {
        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println("1");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println("2");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println("3");
            return null;
        });

        System.out.println("ThreadPool size: " + executor.getPoolSize());  // 2
        System.out.println("Tasks in queue: " + executor.getQueue().size()); // 1
    }
}
