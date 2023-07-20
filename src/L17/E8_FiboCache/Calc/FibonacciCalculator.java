package L17.E8_FiboCache.Calc;

public class FibonacciCalculator implements Sequence{
    public long getNumber(int n)
    {
        if (n==0 || n==1)
            return 0;
        else if(n==2 || n==3)
            return 1;
        return getNumber(n - 1) + getNumber(n - 2);
    }
}
