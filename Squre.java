import java.util.Scanner;

public class Squre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square");
        int a= sc.nextInt();
        int Area =  a * a;
        System.out.println("Area of the Square is"+" "+Area);
        int perimeter = 4 * a;
        System.out.println("Area of the perimeter is"+" "+perimeter);
    }
}
