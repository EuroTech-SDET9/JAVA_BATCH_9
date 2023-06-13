package days.day54;


import java.util.ArrayList;

public class NAmesTest {
    public static void main(String[] args) {
        Names names = new Names();
        System.out.println("names.namesList() = " + names.namesList());
        ArrayList<String> namesList = names.namesList();
        System.out.println("names.randomName() = " + names.randomName());
        System.out.println("names.randomName() = " + names.randomName());
        System.out.println("names.randomName() = " + names.randomName());
        names.printRandomName();
        names.printNamesList();
        System.out.println("names.checkList(\"Monica\") = " + names.checkList("Monica"));
        System.out.println("names.checkList(\"Sait\") = " + names.checkList("Sait"));
        System.out.println("names.checkList(\"Faruk\") = " + names.checkList("Faruk"));
    }


    public void test4() {
      //  Names names=new Names();
        names5.randomName();

    }
    Names names5=new Names();
    public void test5() {
       // Names names=new Names();
        names5.printRandomName();

    }
    public void test6() {
      //  Names names=new Names();
        names5.namesList();

    }

}
