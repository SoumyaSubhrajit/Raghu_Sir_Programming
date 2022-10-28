import java.util.Scanner;

public class p21 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            int x = i;
            for(int j=1; j<=i; j++)
            {
                System.out.print(x%2);         // pending..
                x++;
            }
            System.out.println();
        }
    }
}
