package L4.E4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Designer());
        employees.add(new Programmer());
        employees.add(new Tester());

        Company company = new Company(employees);

        company.createSoftware();
    }

}
