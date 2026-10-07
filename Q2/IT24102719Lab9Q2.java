import java.util.Scanner;

public class IT24102719Lab9Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = circleArea(radius);

        System.out.println("The area of the circle with radius " + radius + " is : " + area);

        sc.close();
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}