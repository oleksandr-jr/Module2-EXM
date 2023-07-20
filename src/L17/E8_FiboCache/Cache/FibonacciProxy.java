package L17.E8_FiboCache.Cache;

import L17.E8_FiboCache.Calc.Sequence;

import java.util.HashMap;
import java.util.Map;

public class FibonacciProxy implements Sequence {
    private static final Map<Integer, Long> cache = new HashMap<>();

    static {
        cache.put(45, 701408733L);
        cache.put(46, 1134903170L);
        cache.put(47, 1836311903L);
        cache.put(48, 2971215073L);
        cache.put(49, 4807526976L);
        cache.put(50, 7778742049L);
        cache.put(51, 7778742049L);
    }

    private final Sequence fibonacciCalculator;

    public FibonacciProxy(Sequence fibonacciCalculator) {
        this.fibonacciCalculator = fibonacciCalculator;
    }

    @Override
    public long getNumber(int n) {
        if (cache.containsKey(n)){
            System.out.println("Cached data");
            return cache.get(n);
        }

        return fibonacciCalculator.getNumber(n);
    }
}
