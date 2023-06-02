package days.day47.first;

//access modifier -->public   reachable from everywhere,same packagges or other packages
//                -->default  reachable in the same packages unreachable in other packages
//                -->private  unreachable out of the class
//                -->protected in same package and in the child class
public class A {
    public int a;
    public String str;
    public static String city = "Roma";
    int b;
    static int c = 60;
    private int d;


    public void print() {
        System.out.println("Helloooo!!!");
        System.out.println("d = " + d);
    }

    void printName() {
        System.out.println("David");
        playFootball();
    }

    private void playFootball() {
        System.out.println("playing footbal!!!");
    }


}
