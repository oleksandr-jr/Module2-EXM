package L12FQ.Q1_E3_WNLoop;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();

        thread.start();
        synchronized (thread){
            thread.wait(500);
        }

        System.out.println(thread.getTotal());
    }
}

class MyThread extends Thread {
    private int total;

    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                this.total += i;
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public int getTotal() {
        return total;
    }
}
