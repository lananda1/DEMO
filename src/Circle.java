public class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2*3.14*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return (2*3.14*radius);
    }
}
