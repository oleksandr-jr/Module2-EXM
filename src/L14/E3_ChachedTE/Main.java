package L14.E3_ChachedTE;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
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

        System.out.println("ThreadPool size: " + executor.getPoolSize());  // 3
        System.out.println("Tasks in queue: " + executor.getQueue().size()); // 0
        /**
         * Размер очереди всегда будет равен нулю,
         * поскольку внутри используется экземпляр SynchronousQueue.
         * В SynchronousQueue пары операций вставки и удаления всегда выполняются одновременно.
         * Таким образом, очередь на самом деле никогда ничего не содержит.
         */
    }
}
