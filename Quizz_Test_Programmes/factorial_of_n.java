import java.util.Scanner;

// write java program to print factorial of n?
public class factorial_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fac = 1;
        for(int i = 1 ;i<=n;i++)
        {
            fac = fac * i;
        }
        System.out.print(fac);
    }
}
