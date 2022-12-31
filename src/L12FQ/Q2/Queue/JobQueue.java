package L12FQ.Q2.Queue;

import java.util.ArrayList;

public class JobQueue {
    ArrayList<Job> jobs = new ArrayList<>();
//    Queue<Job> jobQueue = new PriorityQueue<>();

    public synchronized void put(Job job) {
        jobs.add(job);
        this.notifyAll();
    }

    public synchronized Job getJob() throws InterruptedException {
        while (jobs.size() == 0)
            this.wait();

        return jobs.remove(0);
//        return jobQueue.poll();
    }
}
