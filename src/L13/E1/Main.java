package L13.E1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("asd");



        ThreadGroup threadGroup = new ThreadGroup("G1");

        MyThread myThread1 = new MyThread(threadGroup, "T1");
        MyThread myThread2 = new MyThread(threadGroup, "T2");
        MyThread myThread3 = new MyThread(threadGroup, "T3");


        threadGroup.setMaxPriority(7);

        System.out.println(threadGroup.getMaxPriority());
    }
}

class MyThread extends Thread {

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread " + Thread.currentThread().getName());
        }
    }
}
