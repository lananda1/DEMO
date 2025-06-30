import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {


    public static void main(String[] args) {
        Shape circle = new Circle(12);
        Shape rectangle = new Rectangle(12, 10);
        Shape triangle = new Triangle(12,10,8);
        List<Shape> shapeArray = new ArrayList<Shape>();

        shapeArray.add(circle);
        shapeArray.add(rectangle);
        shapeArray.add(triangle);

        for (Shape s : shapeArray) {
            s.calculateArea();
            s.calculatePerimeter();
        }


      //  rectangle.setDimentions(10);
    }
}
