package days.day45.MultiLevel;

public class Son extends Father {


    double balance;
}



class Test{

    public static void main(String[] args) {
        Son s1 = new Son();  // Thanks to multi level inheritance!!!

        s1.balance=1;
        s1.midBalance=2;
        s1.bigBalance=3;
    }

}
