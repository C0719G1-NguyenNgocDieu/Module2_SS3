import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle: width: " + width + " height: " + height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height;
        System.out.println("Enter width: ");
        width = scanner.nextDouble();
        System.out.println("Enter height: ");
        height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle.display());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
