package L12FQ.E1_WaitNotify;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread staticThread1 = new MyThread();
        MyThread staticThread2 = new MyThread();

        staticThread1.setName("One");

//        MyThread nonStaticThread = new MyThread();


        staticThread1.start();
        staticThread2.start();

        staticThread1.join();
        staticThread2.join();

        System.out.println(Resource.staticValue);
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        Resource.incrementStaticI();
    }
}


class Resource {
    public static int staticValue = 5;

    public int value;



    public static void incrementStaticI(){
        //synchronized (Resource.class) {
            int tempVar = staticValue;

            if (Thread.currentThread().getName().equals("One")) {
                Thread.yield(); // Специально завершаем квант времени
            }

            tempVar++;
            staticValue = tempVar;
        //}
    }

    public void incrementI(){
        //synchronized (this) {
        int tempVar = staticValue;

        if (Thread.currentThread().getName().equals("One")) {
            Thread.yield(); // Специально завершаем квант времени для неправильного результата
        }

        tempVar++;
        staticValue = tempVar;
        //}
    }

}