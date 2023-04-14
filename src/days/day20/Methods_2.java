package days.day20;

public class Methods_2 {
    public static void main(String[] args) {

        getSum(10, 20, 30);
        int num = 20;
        int num2 = 40;
        int num3 = 50;
        getSum(num, num2, num3);
        calculateAge("Ali", 2000);
        int birthYear = 1990;
        String name = "Veli";
        calculateAge(name, birthYear);
        calculateAge("Ayse", 1985);
        isElligibleForVoting(15, "Messi");
        isElligibleForVoting(40, "Pele");
    }

    // calculate eligibility for voting
    //   isElligibleForVoting(age,name) int String
    // if age is over 18
    // Ronaldo is elligible for voting
    // Ronaldo is not elligible for voting
    public static void isElligibleForVoting(int age, String name) {
        //1
        if (age >= 18) {
            System.out.println(name + " is elligible for voting");
        } else {
            System.out.println(name + "  is not elligible for voting");
        }
        //2
        String result = (age >= 18) ? name + " is elligible for voting" : name + " is not elligible for voting";
        System.out.println("result = " + result);
        //3
        boolean b = (age >= 18) ? true : false;
        if (b) {
            System.out.println(name + " is elligible");
        } else {
            System.out.println(name + " is not elligible.");
        }


    }

    // 2023-2000
    // you are 23 years old.
    public static void calculateAge(String name, int birthYear) {
        int age = 2023 - birthYear;
        //          2023-2000
        // you are 23 years old.
//        System.out.println("you are " + age + " years old."); redundat
        System.out.println(name + " is " + age + " years old.");
    }


    public static void getSum(int a, int b, int c) {// 3 int
        int sum = a + b + c;
        System.out.println("sum = " + sum);
    }
}
