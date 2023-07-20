package L6_Comparators.E4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Benchmark_3 {

    public static void main(String[] args) {
//        System.out.println("\t\t\t Simple for \t Stream \t Parallel stream");

        System.out.printf("| %-7s | %-10s | %-10s | %10s |%n", "Amount", "For", "Stream", "Parallel");
        System.out.println("--------------------------------------------------");
        runBenchmark(1_000);
        runBenchmark(10_000);
        runBenchmark(100_000);
        runBenchmark(500_000);
        runBenchmark(1_000_000);
    }


    public static void runBenchmark(int amount){
        List<User> users = UserFactory.createUsers(amount);

        System.out.printf("| %-7d | %10.5f | %10.5f | %10.5f |",
                amount,
                measurePerf(Benchmark_3::forRun, users),
                measurePerf(Benchmark_3::streamRun, users),
                measurePerf(Benchmark_3::parallelStreamRun, users)
                );

        System.out.println();
    }

    public static List<User> streamRun(List<User> users){
        return users.stream()
                .filter(user -> user.getAge() > 30)
                .peek(user -> user.setSalary(user.getBaseSalary() + (user.getSeniority() * 300)))
                .toList();
    }

    public static List<User> parallelStreamRun(List<User> users) {
        return users.parallelStream()
                .filter(user -> user.getAge() > 30)
                .peek(user -> user.setSalary(user.getBaseSalary() + (user.getSeniority() * 300)))
                .toList();
    }


    public static List<User> forRun(List<User> users){
        List<User> resultList = new ArrayList<>();
        for (User user : users) {
            if (user.getAge() > 30){
                user.setSalary(user.getBaseSalary() + (user.getSeniority() * 300));
                resultList.add(user);
            }
        }
        return resultList;
    }


    public static double measurePerf(Function<List<User>, List<User>> func, List<User> userList) {     // (6)
        int numOfExecutions = 100;
        double totTime = 0.0;
        for (int i = 0; i < numOfExecutions; i++) {                          // (7)
            double start = System.nanoTime();                                  // (8)

            func.apply(userList);                                            // (9)

            double duration = (System.nanoTime() - start)/1_000_000;           // (10)
            totTime += duration;                                               // (11)
        }
        double avgTime = totTime/numOfExecutions;                            // (12)
        return avgTime;
    }
}
