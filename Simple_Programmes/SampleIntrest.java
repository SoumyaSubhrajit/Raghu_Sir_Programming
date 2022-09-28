import java.util.Scanner;

public class SampleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount");
       double  p = sc.nextDouble();
        System.out.println("Enter the rate of intrest");
        double  i = sc.nextDouble();
        System.out.println("Enter the time in (in year)");
        double  y = sc.nextDouble();
        double si = (p*i*y)/100;
        System.out.println("Simple intrest "+" "+si);
    }
}
