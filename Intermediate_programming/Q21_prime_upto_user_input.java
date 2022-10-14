import java.util.Scanner;

public class Q21_prime_upto_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fact = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (n % j == 0) {
                    fact++;
                }
            }
            if (fact == 1) {
                System.out.println("it's a prime");
            } else {
                System.out.println("it's not a prime number");
            }

        }
    }
}
