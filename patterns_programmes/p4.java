import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = n; i>=1 ; i--) // i value should be stated for 5 then it should be decrement..
        {
            for(int j =1; j<=n-i; j++) //algo for the space
            {
                System.out.print("  ");
            }
            for (int j = 1 ;j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
