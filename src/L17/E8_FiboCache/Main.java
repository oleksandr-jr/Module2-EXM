package L17.E8_FiboCache;

import L17.E8_FiboCache.Calc.Sequence;
import L17.E8_FiboCache.Builders.FibonacciBuilder;
import L17.E8_FiboCache.Builders.SequenceBuilder;

public class Main {

    public static boolean CACHE = false;

    public static void main(String[] args) {
        SequenceBuilder builder = new FibonacciBuilder();
        Sequence fibonacciSequence = builder.getInstance();

        System.out.println(fibonacciSequence.getNumber(47));
    }
}
