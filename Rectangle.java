import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        System.out.println("Enter the value of the breath");
        double breath = sc.nextDouble();
        double Area = length * breath;
        double Perimeter = 2 * length * breath;
        System.out.println("The area of the rectangle is" + " " + Area);
        System.out.println("The Perimeter of the rectangle is" + " " + Perimeter);
    }
     }

