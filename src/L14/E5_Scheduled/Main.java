package L14.E5_Scheduled;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

    }

    public void scheduledThreadPool(){
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        //corePoolSize — количество потоков, которые нужно хранить в пуле, даже если они простаивают.

        executor.schedule(() -> {
            System.out.println("Hello World");
        }, 2, TimeUnit.SECONDS);
    }

    public void scheduleAtFixedRate(){
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);


        ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hello World");
        }, 2, 1, TimeUnit.SECONDS);
    }


    public void scheduleAtFixedRateNTimes() throws InterruptedException {
        CountDownLatch lock = new CountDownLatch(5);

        ScheduledExecutorService executor2 = Executors.newScheduledThreadPool(5);

        ScheduledFuture<?> future = executor2.scheduleAtFixedRate(() -> {
            System.out.println("Hello World");
            lock.countDown();
        }, 2, 1, TimeUnit.SECONDS);

        lock.await(10, TimeUnit.SECONDS);
        future.cancel(true);
    }


}
