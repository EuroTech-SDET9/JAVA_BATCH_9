package days.day46.ShapeSample;

public class Shape {



    public void draw(String shapeType){
        System.out.println("Prepare printer");
        System.out.println("Add white paper");
        System.out.println("Top-up ink");
        System.out.println("Draw a " + shapeType);
    }

    public Shape test(){
Shape obj1 = new Shape();
        return obj1 ;
    }
}
