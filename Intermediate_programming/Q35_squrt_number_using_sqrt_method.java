import java.util.Scanner;

public class Q35_squrt_number_using_sqrt_method {
    public static double isSqrt(int n)
    {
        double t=0;
        double  sqrt = n/2;
        while((t-sqrt!=0)){
            t = sqrt;

            sqrt = (t + (n/t))/2;
        }
        return sqrt;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        double num = isSqrt(n);
        System.out.println(num);

    }
}
