package L4.E4;

import java.util.ArrayList;

public class Company {

    ArrayList<Employee> employees;

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void createSoftware(){
        for (Employee employee : employees) {
            employee.doWork();
        }
    }
}
