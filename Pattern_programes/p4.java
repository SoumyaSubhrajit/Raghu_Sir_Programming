import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++)
        {
            for(int j = 1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int j = i; j>=1; j--)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
