package days.day45;

public class Secretary extends Employee {

    String officeName;
    int managerID;


   public void giveReport(){
       System.out.println("Reports was published!");
   }

   public void createList(){
        System.out.println("List is created");
   }

    @Override
    public String toString() {
        return "Secretary{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", vacationDay=" + vacationDay +
                ", gender=" + gender +
                ", officeName='" + officeName + '\'' +
                ", managerID=" + managerID +
                '}';
    }
}
