package days.day46.SchoolAdmin;

public class SchoolAdmin { // SUPER CLASS

    String name;
    int birthYear;
    char gender;
    String staffType;

    public SchoolAdmin(String name, int birthYear, char gender) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
    }
  /*
    1- I don't want to initialize this data fields in child class
    do it in parent class!!! const!!!
    2- then update all child class const!!!
    3- be carefully about sub class's characteristic data fields!! they should stay in child class cons!!
    4- Create objects for each sub class and test them 1!!
     */
    public void signContract(String staffType){
        System.out.println("Sign the Contract as "+ staffType);
    }



}
