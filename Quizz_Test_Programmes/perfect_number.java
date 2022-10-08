import java.util.Scanner;

// write a java program to calculate the sum of perfect number with in n?
public class perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }

            }
            if (sum == n) {
                System.out.println(sum);
            }

        }
    }
