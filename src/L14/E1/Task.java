package L14.E1;

class Task implements Runnable {
    private final int taskNumber;

    public Task(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }

        if (taskNumber == 5) {
            Thread.currentThread().stop();
        }

        System.out.printf("Обработан запрос #%d в потоке %s id=%d\n",
                taskNumber, Thread.currentThread().getName(), Thread.currentThread().getId());
    }
}
