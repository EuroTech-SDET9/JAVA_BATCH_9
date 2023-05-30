package days.day45;

public class EmployeeTest {

    public static void main(String[] args) {

        Developer dev1 = new Developer();
        dev1.name = "Monika";
        dev1.employeeID = 1001;
        dev1.salary = 60000;
        dev1.workHours = 40;
        dev1.vacationDay = 30;
        dev1.gender = 'F';
        dev1.raiseSalary(100000);
        System.out.println("dev1 = " + dev1);

        System.out.println("\n//////////////////////////\n");

        Lawyer lawyer1 = new Lawyer();
        lawyer1.name = "Yavuz";
        lawyer1.employeeID = 1002;
        lawyer1.salary = 40000;
        lawyer1.workHours = 35;
        lawyer1.vacationDay = 20;
        lawyer1.gender = 'M';
        System.out.println("lawyer1 = " + lawyer1);

    }

}
