package L14.E1;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Executor
        // метод execute для отправки экземпляров Runnable на выполнение.
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(()-> {
            System.out.println("Hello world");
        });

        // Executor service
        // содержит большое количество методов для управления ходом выполнения задач
        // и управления завершением службы. Используя этот интерфейс,
        // мы можем отправлять задачи на выполнение,
        // а также контролировать их выполнение с помощью возвращаемого экземпляра Future.
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(1000);
            return "Future result";
        } );




        String result = future.get();
        System.out.println(result);
        executorService.shutdownNow();




        //----------------


        // Example of creating new thread if crash
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

//        ThreadFactory threadFactory = new MyThreadFactory();
//        ExecutorService executorService2 = Executors.newSingleThreadExecutor(threadFactory);

        for (int i = 0; i < 1_000; i++) {
            executorService2.execute(new Task(i));
        }

        executorService2.awaitTermination(10, TimeUnit.SECONDS);
        executorService2.shutdownNow();

        System.out.println("End");

    }
}
