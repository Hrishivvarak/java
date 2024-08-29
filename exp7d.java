class RectangleCalculator {
    class Rectangle {
        double width;
        double height;
        Rectangle() {
            this.width = 1.0;
            this.height = 1.0;
        }
        Rectangle(double side) {
            this.width = side;
            this.height = side;
        }
        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        double calculateArea() {
            return width * height;
        }
    }
}

public class exp7d {
    public static void main(String[] args) {
        RectangleCalculator calculator = new RectangleCalculator();
        RectangleCalculator.Rectangle rect1 = calculator.new Rectangle(); 
        RectangleCalculator.Rectangle rect2 = calculator.new Rectangle(5);
        RectangleCalculator.Rectangle rect3 = calculator.new Rectangle(3, 7);
        System.out.println("Area of rect1: " + rect1.calculateArea());
        System.out.println("Area of rect2: " + rect2.calculateArea());
        System.out.println("Area of rect3: " + rect3.calculateArea());
    }
}
