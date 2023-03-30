package days.day11;

public class If1 {
    public static void main(String[] args) {

        int a = 25;
        int b = 15;
        boolean isNumberLessThen15 = a < b;
        if (isNumberLessThen15) {
            System.out.println(a + " is less then " + b);
        } else {
            System.out.println(a + " is not less then " + b);
        }
// age is greater then 18 and weight is greater then 50   can donate blood
        int age = 15;
        int weight = 70;
        String name = "Ali";
        if (age > 18 && weight > 50) {
            System.out.println(name + " is elligible for donating blood.");
        } else {
            System.out.println(name + " is not elligible for donating blood.");
        }
// nested if
        age = 16;
        weight = 45;
        name = "Ayse";
        if (age > 18) {
            if (weight > 50) {
                System.out.println(name + " is elligible for donating blood.");
            } else {
                //    Ayse your weight is not enough for donating blood
                System.out.println(name + " your weight is not enough for donating blood.");
            }
        } else {
            System.out.println("age is under 18");
        }


    }
}
