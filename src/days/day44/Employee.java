package days.day44;

import java.util.ArrayList;

public class Employee {
    private String name;
    int employeeId;
    double salary;
    int annualLeave;
    static int numberOfEmployees;
  static   ArrayList<String> nameList = new ArrayList<>();

    Employee(String n) {
        numberOfEmployees++;
        employeeId = numberOfEmployees;
        nameList.add(n);
        this.name = n;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ali");
        System.out.println("employee1.getName() = " + employee1.getName());
        employee1.setName("Seyfettin");
        String employee1Name = employee1.getName();
        System.out.println("employee1Name = " + employee1Name);
        Employee employee2 = new Employee("Georges");
        Employee employee3 = new Employee("Yavuz");
        System.out.println("employee1.employeeId = " + employee1.employeeId);
        System.out.println("employee2.employeeId = " + employee2.employeeId);
        System.out.println("employee3.employeeId = " + employee3.employeeId);
        System.out.println("Employee.numberOfEmployees = " + Employee.numberOfEmployees);
//        System.out.println("employee3.nameList = " + employee3.nameList);
//        System.out.println("employee2.nameList = " + employee2.nameList);
//        System.out.println("employee1.nameList = " + employee1.nameList);
        System.out.println("Employee.nameList = " + Employee.nameList);

    }

}
