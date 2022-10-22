import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int  i =1 ;i<=n; i++) // this loop will continue for the 5 times..
        {
            int x = i;
            for(int j =1; j<=n-i; j++ )
            {
                System.out.print("  ");
            }
            for(int j  =1; j<=i; j++){
                System.out.print(x+" ");
            }
            ++x;
            System.out.println();
        }
    }
}
