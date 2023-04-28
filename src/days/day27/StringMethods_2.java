package days.day27;

import java.util.Locale;

public class StringMethods_2 {
    public static void main(String[] args) {
        String name = "Ali";
        String name2 = "Ali";
        System.out.println(name.equals(name2));
        System.out.println(name.equals("Ali"));
        name2 = "ali";
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.equalsIgnoreCase("ali"));//true
        System.out.println(name.equals("ali"));//false
        System.out.println("ali".equalsIgnoreCase("ALI"));//true

        //tolowercase -- touppercase
        name2 = "ALI";
        name = "ali";
        System.out.println(name2.toLowerCase());//ali
        System.out.println(name.toUpperCase());

        System.out.println("name2 = " + name2);// ALI

        //strings are immutable - not possible to change
        name2 = "Veli";
        System.out.println(name2);
        switch (name2.toLowerCase()) {// veli
            case "VELI":
                System.out.println("VELI");
                break;
            case "veli":
                System.out.println(" case 2, veli ");
                break;

        }
        name = "veli";
        switch (name.toUpperCase()) {// VELI
            case "VELI":
                System.out.println(" case 1 , VELI");
                break;
            case "veli":
                System.out.println(" case 2, veli ");
                break;
        }
//        name = "Veli";
//        switch (name.equalsIgnoreCase("Veli")) {//  not possible to aplly this method here
//            case "VELI":
//                System.out.println(" case 1 , VELI");
//                break;
//            case "ali":
//                System.out.println(" case 2, ali ");
//                break;
//        }

    }
}
