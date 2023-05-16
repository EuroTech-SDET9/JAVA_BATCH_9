package days.day37.SDETsample;

public class SDET {

    String name;
    int age;
    String gender;
    String company;
    double salary;
    boolean isSuccessful;

    static int countSDET=0;

    public SDET(String name, int age, String gender, String company, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.salary = salary;
        isSuccessful = true;
        System.out.println("!!!! CONST !!!!");

        SDET.countSDET++;
        System.out.println("SDET.countSDET = " + SDET.countSDET);
    }

    public void increaseSalary(double raiseAmount) {
        salary = salary + raiseAmount;
        System.out.println("NEW Salary is " + salary);
    }

    public void changeCompany(String newCompany) {
        company = newCompany;
        System.out.println("New company is " + company);
    }


    @Override
    public String toString() {
        return "SDET{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isSuccessful=" + isSuccessful +
                '}';
    }
}

class SdetTest {

    public static void main(String[] args) {

        SDET sdet1 = new SDET("Monica", 30, "F", "Apple", 110000);



        System.out.println(sdet1);

        sdet1.changeCompany("KLM Airlines");
        sdet1.increaseSalary(20000);

        System.out.println(sdet1);

        System.out.println("\n////////////////////////\n");

        SDET sdet2 = new SDET("Yavuz", 30, "F", "Apple", 100000);

        System.out.println("\n////////////////////////\n");

        SDET sdet3 = new SDET("Ashwini", 30, "F", "Apple", 130000);


        System.out.println("\n////////////////////////\n");

        SDET sdet4 = new SDET("Azizzullah", 30, "F", "Apple", 120000);


        System.out.println("\n////////////////////////\n");


        SDET talha = new SDET("Talha", 35, "M", "euroTech", 1);
        SDET.countSDET++;

    }
}
