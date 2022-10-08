import java.util.Scanner;

// write a java program to print the sum of digits in the number?
public class digit_of_n_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++)
        {
          sum = sum+i;
        }
        System.out.println(sum);
    }
}
