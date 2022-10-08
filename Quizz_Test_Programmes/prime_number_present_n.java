import java.util.Scanner;

// write java program to print how many prime numbers present with in n? consider 1 as a prime..
public class prime_number_present_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            int fac = 0;
            for (int j = 2 ; j * j <= i; j++)
            {
                if (i % j == 0) {
                    fac++;
                    break;
                }
            }
            if (fac == 0)
            {
                System.out.println(i);
            }
        }
    }
}