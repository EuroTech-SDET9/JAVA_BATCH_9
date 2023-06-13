package days.day54;

import days.day53.Calculator;

public abstract class Shape {
    private String colorOfShape;

    public abstract void draw();

    public void paintShape(String color) {
        System.out.println("Painting the shape " + color);
        this.colorOfShape = color;
    }

    public String getColorOfShape() {
        return colorOfShape;
    }
}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing triangle.");
    }
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle.");
    }

    public void paintShape(String color) {
        System.out.println("We will paint circle and color is : " + color);
    }
}

class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.draw();
        shape = new Rectangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
        shape.paintShape("Blue");
        Circle circle1 = new Circle();
        circle1.paintShape("Grey");
        drawShape(circle1);
        drawShape(new Rectangle());
        drawShape(new Triangle());
//        drawShape(new Calculator());
//        Shape shape1=new Shape();

        Shape shape1=new Triangle();
        shape1.paintShape("Yellow");
        String colorOfShape = shape1.getColorOfShape();
        System.out.println("shape1.getColorOfShape() = " + shape1.getColorOfShape());
        System.out.println("colorOfShape = " + colorOfShape);
        Rectangle rectangle=new Rectangle();
        rectangle.paintShape("Black");
        System.out.println("rectangle.getColorOfShape() = " + rectangle.getColorOfShape());
    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }

//    public static void drawShape(Circle circle) {
//        circle.draw();
//    }
//
//    public static void drawShape(Triangle triangle) {
//        triangle.draw();
//    }


}



