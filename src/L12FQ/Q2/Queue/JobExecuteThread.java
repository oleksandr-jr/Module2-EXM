package L12FQ.Q2.Queue;

class JobExecuteThread extends Thread {
    JobQueue jobQueue;
    public JobExecuteThread(JobQueue jobQueue) {
        this.jobQueue = jobQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Job job = jobQueue.getJob();
                long result = job.doJob();
                System.out.println(getName() + " | JobID : " + job.getId()
                        + " | Number : " + job.getInfo()
                        + " | Result : " + result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}