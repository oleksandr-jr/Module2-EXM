package L14.E4_StealingPool;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Collection<Callable<Void>> tasks = new ArrayList<>();
        ExecutorService executorService = Executors.newWorkStealingPool(10);

        for (int i = 0; i < 20; i++) {
            int taskNumber = i;
            Callable<Void> callable = () -> {
                System.out.println("Обработан запрос пользователя №" + taskNumber + " на потоке " + Thread.currentThread().getName());
                return null;
            };
            tasks.add(callable);
        }
        executorService.invokeAll(tasks);
    }
}
