package L14.E1;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {
    public static int COUNT = 0;

    @Override
    public Thread newThread(Runnable r) {
        Thread newThread = new Thread(r, "MyThread-" + COUNT++);
        newThread.setPriority(Thread.NORM_PRIORITY);
        return newThread;
    }
}
