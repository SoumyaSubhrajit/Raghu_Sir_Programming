import java.util.Scanner;

public class Biggest_among_Nondecimal_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double x = sc.nextDouble();
        System.out.println("Enter Second number");
        double y = sc.nextDouble();
        System.out.println("Enter Third number");
        double z = sc.nextDouble();
        double big = x;
        if(y> big){
            big = y;
        }
        if( z > big){
            big = z;
        }
        System.out.println("The biggest among 3 decimal number is"+" "+big);
    }
}
