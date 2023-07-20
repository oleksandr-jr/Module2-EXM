package L17.E8_FiboCache.Builders;

import L17.E8_FiboCache.Cache.FibonacciProxy;
import L17.E8_FiboCache.Calc.FibonacciCalculator;
import L17.E8_FiboCache.Calc.Sequence;
import L17.E8_FiboCache.Main;

public class FibonacciBuilder implements SequenceBuilder{
    private final boolean CACHING = Main.CACHE;

    @Override
    public Sequence getInstance() {
        Sequence sequence = new FibonacciCalculator();
        if (CACHING){
            sequence = new FibonacciProxy(sequence);
        }

        return sequence;
    }
}
