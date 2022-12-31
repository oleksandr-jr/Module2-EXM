package L12FQ.Q2.Queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JobQueue jobQueue = new JobQueue();
        JobExecuteThread executeThread1 = new JobExecuteThread(jobQueue);
        JobExecuteThread executeThread2 = new JobExecuteThread(jobQueue);
        executeThread1.start();
        executeThread2.start();

//        jobQueue.put(new Fibonacci(5));
//        Thread.sleep(1000);
//        jobQueue.put(new Fibonacci(6));
//        Thread.sleep(1000);
//        jobQueue.put(new Fibonacci(7));
//        Thread.sleep(1000);
//        jobQueue.put(new Fibonacci(8));
//        jobQueue.put(new Fibonacci(9));
//        Thread.sleep(1000);
//        jobQueue.put(new Fibonacci(25));
//        jobQueue.put(new Fibonacci(27));

        Scanner sc = new Scanner(System.in);
        int number = 1;
        while (number != -1){
            System.out.println("Input a number");
            number = sc.nextInt();
            Job job = new Fibonacci(number);
            jobQueue.put(job);

            System.out.println("Job added to queue ID : " + job.getId());
        }


    }
}

