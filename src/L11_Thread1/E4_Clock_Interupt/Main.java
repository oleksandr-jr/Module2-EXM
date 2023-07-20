package L11_Thread1.E4_Clock_Interupt;

public class Main {
    public static void main(String[] args) throws InterruptedException {



//        // first example
//        Clock clock = new Clock();
//
//        Thread thread = new Thread(clock);
//        thread.start();
//
//        Thread.sleep(5000);
//
//        clock.cancel();

        //second example

        long startTime = System.nanoTime();

        GoodClock goodClock = new GoodClock();

        Thread thread1 = new Thread(goodClock);
        thread1.start();

        Thread.sleep(3000);

        thread1.interrupt();


    }
}

class Clock implements Runnable{
    private int seconds = 0;

    private boolean isCancelled = false;

    public void cancel(){
        isCancelled = true;
    }

    @Override
    public void run() {
        while (!isCancelled){
            System.out.println("Seconds: " + this.seconds++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class GoodClock implements Runnable{
    private int seconds = 0;


    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();

        while (!currentThread.isInterrupted()){
            System.out.println("Seconds: " + this.seconds++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                currentThread.interrupt();
//                throw new RuntimeException(e);
            }
        }
    }
}
