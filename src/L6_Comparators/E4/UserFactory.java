package L6_Comparators.E4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserFactory {
    private static final String[] usernames = {"john_doe", "jane_smith", "alice123", "bob_007", "emma_wilson"};
    private static final String[] domains = {"example.com", "test.org", "sample.net", "demo.io", "xyz.co"};
    private static final String[] passwords = {"pass123", "securepw", "password123", "secret", "letmein"};
    private static final int MAX_AGE = 65;
    private static final double MAX_BASE_SALARY = 10_000.0;
    private static final int MAX_SENIORITY = 10;

    public static List<User> createUsers(int count) {
        List<User> users = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            String username = getRandomElement(usernames) + "_" + random.nextInt(1000);
            String email = getRandomElement(usernames) + "@" + getRandomElement(domains);
            String password = getRandomElement(passwords);
            int age = random.nextInt(MAX_AGE) + 18;
            double baseSalary = random.nextDouble() * MAX_BASE_SALARY;
            int seniority = random.nextInt(MAX_SENIORITY) + 1;

            User user = new User(username, email, password, age, baseSalary, seniority);
            users.add(user);
        }

        return users;
    }

    private static <T> T getRandomElement(T[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
}

