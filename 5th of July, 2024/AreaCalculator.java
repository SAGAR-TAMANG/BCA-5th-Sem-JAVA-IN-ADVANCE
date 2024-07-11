import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length and breadth of the rectangle:");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        double rectangleArea = length * breadth;
        System.out.println("Area of Rectangle: " + rectangleArea);

        System.out.println("Enter the base and height of the triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of Triangle: " + triangleArea);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);

        System.out.println("Enter the side of the square:");
        double side = scanner.nextDouble();
        double squareArea = side * side;
        System.out.println("Area of Square: " + squareArea);
    }
}
