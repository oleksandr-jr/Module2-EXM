package L9_Object.E1_Equals;

public class Employee {
    private String name;
    private int age;
    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return jobTitle != null ? jobTitle.equals(employee.jobTitle) : employee.jobTitle == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (jobTitle != null ? jobTitle.hashCode() : 0);
        return result;
    }
}
