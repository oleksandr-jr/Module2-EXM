package L12_Thread2.E3_Volatile;

class TestVolatile extends Thread{

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(1000);
        System.out.println("after sleeping in main");
        t.keepRunning = false;
        //t.join();
        System.out.println("keepRunning set to " + t.keepRunning);
    }
}


class MyThread extends Thread {
    //volatile
    volatile boolean keepRunning = true;

    public void run() {
        long count = 0;
        while (keepRunning) {
            count++;
        }

        System.out.println("Thread terminated. " + count);
    }
}