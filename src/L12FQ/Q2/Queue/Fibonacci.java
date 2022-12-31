package L12FQ.Q2.Queue;

public class Fibonacci implements Job {
    private static int idCounter = 0;
    private final int id;

    private final int number;

    long fib(int n)
    {
        if (n==0||n==1)
            return 0;
        else if(n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public Fibonacci(int number) {
        this.number = number;
        this.id = idCounter++;
    }

    @Override
    public long doJob() {
        return fib(number);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getInfo() {
        return this.number;
    }

}
