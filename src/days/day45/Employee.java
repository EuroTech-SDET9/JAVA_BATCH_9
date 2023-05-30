package days.day45;

public class Employee {  // SUPER or PARENT CLASS!!!!

    // Data fields
    String name;
    int employeeID;
    double salary;
    double workHours;
    double vacationDay;
    char gender;


    // Functions
    public void raiseSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("New salary is "+ newSalary);
    }

    public void leaveHoliday(double holidayUsages) {
        this.vacationDay -= holidayUsages;
    }

    public void resign() {
        this.salary = 0;
        this.vacationDay = 0;
    }

}
