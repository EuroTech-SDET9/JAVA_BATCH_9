package days.day45;

public class Lawyer extends Employee {

    String caseName;
    String caseStatus;

    public void joinCourt(){
        System.out.println("Join the Court!");
    }

    public void submitClaim(){
        System.out.println("Claim is submitted");
    }

    @Override
    public String toString() {
        return "Lawyer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", vacationDay=" + vacationDay +
                ", gender=" + gender +
                ", caseName='" + caseName + '\'' +
                ", caseStatus='" + caseStatus + '\'' +
                '}';
    }
}
