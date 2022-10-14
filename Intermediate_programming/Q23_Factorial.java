import java.util.Scanner;

public class Q23_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fac= 1;
        int temp = n;
        while( n > 1)
        {
            fac = fac * n;
            n--;
            System.out.println(temp+" "+ "*" + " "+ n + " "+ "=" +" "+ fac);
        }
    }
}
