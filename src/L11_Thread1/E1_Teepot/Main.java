package L11_Thread1.E1_Teepot;

import common.Console;
import common.Print;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Teapot start
        Teapot teapot = new Teapot();
        teapot.start();

//        teapot.run();

        // Toaster start
        Toaster toaster = new Toaster();
        Thread thread = new Thread(toaster);

        thread.start();

        Thread.sleep(1000);
        System.out.println("Туда");
        Thread.sleep(1000);
        System.out.println("Сюда");
        Thread.sleep(1000);
        System.out.println("Обратно");



    }

    public static class Teapot extends Thread {
        @Override
        public void run() {
            Print.ln("Teapot is on", Console.color.RED);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Print.ln("Teapot has finished", Console.color.RED);

//            throw new RuntimeException();
        }
    }

    public static class Toaster implements Runnable{

        @Override
        public void run() {
            Print.ln("Toaster is on", Console.color.GREEN);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Print.ln("Toaster has finished", Console.color.GREEN);
        }
    }
}
