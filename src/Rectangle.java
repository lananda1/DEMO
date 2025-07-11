public class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+breadth);
    }

    public void setDimensions(int length) {
        this.length = length;
    }

    public void setDimensions(int length, int breadth) {
        this.length=length;
        this.breadth = breadth;
    }
}
