package L6_Comparators.E4;

import java.util.Objects;

public class User {
    private static long counter;
    private long id;
    private String username;
    private String email;
    private String password;
    private int age;
    private double baseSalary;
    private int seniority;
    private double salary;

    public User(String username, String email, String password, int age, double baseSalary, int seniority) {
        this.id = counter++;
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.baseSalary = baseSalary;
        this.seniority = seniority;
    }

    public static long getCounter() {
        return counter;
    }

    public static void setCounter(long counter) {
        User.counter = counter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", username='" + username + '\'' +
               ", email='" + email + '\'' +
               ", password='" + password + '\'' +
               ", age=" + age +
               ", baseSalary=" + baseSalary +
               ", seniority=" + seniority +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Double.compare(user.baseSalary, baseSalary) == 0 && seniority == user.seniority && Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, password, age, baseSalary, seniority);
    }
}
