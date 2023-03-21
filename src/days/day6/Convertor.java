package days.day6;

public class Convertor {


    public static void main(String[] args) {


        double celsius, fah = 158.36;

        celsius = ((fah - 32) * 5) / 9;

        System.out.println(fah + " Fah is " + celsius + " celsius");


        ///////////////////////////


        double mile=85, km;
        km = mile * 1.81666 ;
        System.out.println("km = " + km);


        System.out.println(10/3);

        double d1 = 4.64;
        double d2 = 2.0;
        double d3 = 2.64;
        double d4 = d1 - d2;

        System.out.println("d1      : " + d1);
        System.out.println("d2      : " + d2);
        System.out.println("d3      : " + d3);
        System.out.println("d4      : " + d4);
        System.out.println("d1 - d2 : " + (d1 - d2));  // because of double binary calculation

    }
}
