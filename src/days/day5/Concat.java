package days.day5;

public class Concat {
    public static void main(String[] args) {
        String name, surName, fullName;
        name = "Christian ";
        surName = "Ronaldo";
        System.out.println(5 + 8);//  addition
//        fullName = name +" "+ surName;// concatenation
        fullName = name + surName;// concatenation
        System.out.println("fullName = " + fullName);// ChristianRonaldo
        String player = fullName;
        player = "Benzama";
        System.out.println(player + " was playing for Real Madrid");
        String clubName = "Real Madrid";
        player = "Zidane";
        System.out.println(player + " was playing for " + clubName);
        //                 Zidane   was playing for   Reald Madrid


    }
}
