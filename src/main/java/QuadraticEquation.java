import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0) {
            return (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 * this.a;
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0) {
            return (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 * this.a;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        System.out.println("The equation: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
    }
}
