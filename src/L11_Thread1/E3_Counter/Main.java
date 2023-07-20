package L11_Thread1.E3_Counter;

import common.Console;
import common.Print;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        count.setColor(Console.color.GREEN);
        count.start();

        Count count2 = new Count();
        count2.setColor(Console.color.BLUE);
        count2.start();

//        new Thread(() -> {
//            while (true){
//                try {
//                    Thread.sleep(1000);
//                    System.out.println("Hello");
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }).start();


    }


}

class Count extends Thread{
    String color;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            Print.ln(Thread.currentThread().getName() + " - " + i, color);
        }
    }
}


