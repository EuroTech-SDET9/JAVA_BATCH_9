package days.day38;

public class CircleTest {

    public static void main(String[] args) {

        Circle c1 = new Circle(10);
        getArea(c1);
        Circle c2 = new Circle(15);
        getArea(c2);
        Circle c3 = new Circle(20);
        getArea(c3);

    }

    public static void getArea(Circle obj){
        double area = Math.PI * obj.radios * obj.radios;
        System.out.println("Your circle area = " + area);
    }
}
