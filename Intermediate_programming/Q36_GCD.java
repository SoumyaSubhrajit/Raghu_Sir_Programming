import java.util.Scanner;

public class Q36_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        int gcd = 0;
        while(n1 % n2 != 0)
        {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        gcd = n2;
        System.out.println(gcd);


    }
}
