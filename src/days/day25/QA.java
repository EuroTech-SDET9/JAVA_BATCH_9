package days.day25;

import java.util.Scanner;

public class QA {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double waterInKg=0, initialTemp=0,finalTemp=0;
        System.out.println("Enter the amount of water in kilogram: ");
        if (scanner.hasNextDouble()) {
            waterInKg = scanner.nextDouble();
        }else{
            scanner.next();
            System.out.println("please enter valid water quantity");
        }

        System.out.println("Enter the initial temperature (Degree Celsius): ");
        if(scanner.hasNextDouble()){
            initialTemp = scanner.nextDouble();
        }else{
            scanner.next();  // it s help us to continue read the data!!!
            System.out.println("Please enter valid temp");
        }

        System.out.println("Enter the final temperature (Degree Celsius): ");
        if (scanner.hasNextDouble()){
            finalTemp= scanner.nextDouble();
        }else {
            scanner.next();
            System.out.println("Enter valid temperature");
        }


        energyCalculator(waterInKg, initialTemp,finalTemp);

    }

    public static void energyCalculator (double M, double initialTemp, double finalTemp){
        double energy = M*(finalTemp-initialTemp)*4184;
        System.out.println("The energy needed to heat water from " + initialTemp + " to " + finalTemp +" degree Celsius is: " + energy);
    }

}
