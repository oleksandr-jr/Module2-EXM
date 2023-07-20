package L12_Thread2.E5_DeadLock;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        String obj1 = "String 1";
        String obj2 = "String 2";
        String obj3 = "String 3";


        Thread t1 = new Thread(new SyncThread(obj1, obj2), "t1");
        Thread t2 = new Thread(new SyncThread(obj2, obj3), "t2");
        Thread t3 = new Thread(new SyncThread(obj3, obj1), "t3");

        t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
        t3.start();

    }

}

class SyncThread implements Runnable{
    private String obj1;
    private String  obj2;

    public SyncThread(String o1, String o2){
        this.obj1=o1;
        this.obj2=o2;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " пытается блокировать "+obj1);

        synchronized (obj1) {
            System.out.println(name + " Заблокировал "+obj1);
            work();
            System.out.println(name + " пытается блокировать "+obj2);
            synchronized (obj2) {
                System.out.println(name + " Заблокировал "+obj2);
                work();
            }
            System.out.println(name + " Снял блокировку "+obj2);
        }


        System.out.println(name + " released lock on "+obj1);
        System.out.println(name + " finished execution.");
    }
    private void work() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}