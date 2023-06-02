package days.day47.first;

public class C {
    public static void main(String[] args) {
        A a = new A();
        a.str = "Hello";
        a.a = 10;
        System.out.println("A.city = " + A.city);
        a.print();
        a.b = 500;
        System.out.println("A.c = " + A.c);
        a.printName();
        // System.out.println("a.d = " + a.d);
//        a.playFootball(); unreachable out of the class
        // City city = new City();
        //  city.population = 100000;
        D d = new D();
        d.n = 80;
        E e = new E();
        Protect protect = new Protect();
        System.out.println("protect.n = " + protect.n);
        System.out.println("protect.str = " + protect.str);
        protect.print();

    }
}
