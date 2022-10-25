import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int x = 1;
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=(2 * i-1); j++)
            {
                System.out.print(x%2);
                x++;
            }
            System.out.println();
        }
    }
}
