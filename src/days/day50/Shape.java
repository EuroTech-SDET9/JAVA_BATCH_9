package days.day50;

public abstract class Shape {

    // Circle     Rectangle
    double area;

    public abstract double getArea();

//    public abstract double getPerimeter();


}

class Circle extends Shape {

    Circle(int rad) {
        radius = rad;
    }

    int radius;

    public double getArea() {
       // area = Math.PI * radius * radius;
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

class Rectangle extends Shape {
    Rectangle() {

    }

    Rectangle(int a, int b) {
        width = a;
        height = b;
    }

    int height;
    int width;

    public double getArea() {
        area = height * width;
        return area;
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        //circle.radius = 5;
        System.out.println("circle.getArea() = " + circle.getArea());
        Circle circle1 = new Circle(10);
        double area2 = circle1.getArea();
        System.out.println("area2 = " + area2);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 7;
        double areaRectangle1 = rectangle.getArea();
        System.out.println("areaRectangle1 = " + areaRectangle1);
        Rectangle rectangle1 = new Rectangle(20, 10);
        System.out.println("rectangle1.getArea() = " + rectangle1.getArea());


    }

}
