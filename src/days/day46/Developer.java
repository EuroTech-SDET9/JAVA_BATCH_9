package days.day46;

public class Developer extends Employee { // Child / Sub Class extended to PARENT/SUPER class!!

    public Developer(){
        super();
        System.out.println("!! Developer Child CONST !!");

    }

   public String projectName;
   public String mainLang;

    public void releaseCode(String environment){
        System.out.println("Code is releasing to the " + environment);
    }

    public void assignVM(){
        System.out.println("Assigned to VM");
    }


    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", vacationDay=" + vacationDay +
                ", gender=" + gender +
                ", projectName='" + projectName + '\'' +
                ", mainLang='" + mainLang + '\'' +
                '}';
    }
}
