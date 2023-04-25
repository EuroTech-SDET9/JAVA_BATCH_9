package days.day24;

import java.util.Scanner;

public class DynamicSamples {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter radius value: ");
//        double radius = scanner.nextDouble();
//        calculateCircleArea(radius);
//        System.out.println(" //////////////////////// \n");
//
//        System.out.println("Please enter celsius value: ");
//        double celsius = scanner.nextDouble();
//        convertedTemp(celsius);

        System.out.println(" //////////////////////// \n");

        System.out.println("Please enter value: ");
        int value= scanner.nextInt();
        exercise2_2(value);

    }


    public static void calculateCircleArea(double radius){
        System.out.println("Please enter radius: ");
        double area = radius * radius * 3.14;
        System.out.println("Area = " + area);
    }

    public static void convertedTemp(double celsius){
        double fah = (9/5.0) * celsius + 32;
        System.out.println(celsius + " Celsius is "+ fah + " Fahrenheit");
    }


    public void exercise2(int value){  // 981
        if(value>999 || value<1) {
            System.out.println(" Please enter valid input!!!");
        } else{
            int digit1 = value % 10; // get 1
            value=(value / 10); // update value 981 -> 98.1 -> 98    --> value/=10;
            int digit2 = value % 10; // get 8
            value=(value / 10); // update value 98 -> 9.8 -> 9
            int digit3 = value % 10; // get 9
            System.out.println("Digits sum = " + (digit1+digit2+digit3));

          // int sum = value%10 + (value/10)%10 + (value/100)%10;
        }
    }

    public static void exercise2_2(int value) {  // 981
    int sum=0;
    if(value<0){
        value = -1*value;
    }
    while (value>0){
        int digit = value%10;
        sum+= digit;
        value/=10; // same as -> value = value/10
    }
        System.out.println("Digits sum = " + sum);
    }
}
