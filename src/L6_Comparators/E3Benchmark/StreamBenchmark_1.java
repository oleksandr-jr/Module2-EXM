package L6_Comparators.E3Benchmark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBenchmark_1 {

    public static void main(String[] args) {
        int arraySize = 1_000_000;
        int iterations = 10;

        int[] array = generateIntArray(arraySize);
        List<Integer> list = generateIntegerList(arraySize);

        long streamTime = measureExecutionTime(() -> {
            for (int i = 0; i < iterations; i++) {
                Stream<Integer> stream = Stream.of(toObjectArray(array));
                Map<Integer, Integer> resultMap = stream
                        .filter(x -> x % 2 == 0) // Фільтрація: лише парні числа
                        .map(x -> x * 2) // Перетворення: множення на 2
                        .collect(HashMap::new, (map, value) -> map.put(value, value), HashMap::putAll); // Збір результату в Map
            }
        });

        long loopTime = measureExecutionTime(() -> {
            for (int i = 0; i < iterations; i++) {
                Map<Integer, Integer> resultMap = new HashMap<>();
                for (int j = 0; j < array.length; j++) {
                    int element = array[j];
                    if (element % 2 == 0) { // Фільтрація: лише парні числа
                        int transformedValue = element * 2; // Перетворення: множення на 2
                        resultMap.put(transformedValue, transformedValue); // Збір результату в Map
                    }
                }
            }
        });

        System.out.println("Stream API execution time: " + streamTime + " milliseconds");
        System.out.println("Loop execution time: " + loopTime + " milliseconds");
    }

    private static int[] generateIntArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private static List<Integer> generateIntegerList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

    private static Integer[] toObjectArray(int[] array) {
        return IntStream.of(array).boxed().toArray(Integer[]::new);
    }

    private static long measureExecutionTime(Runnable task) {
        long startTime = System.nanoTime();
        task.run();
        long endTime = System.nanoTime();
        return TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
    }
}
