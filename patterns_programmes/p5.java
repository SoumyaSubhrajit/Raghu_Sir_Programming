import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = n; i>=1; i--) // first i = 5 , 5>=1 , i--
        {
            for(int j = 1; j<=n; j++)  // this loop will continue for printing i value which is 5 time row..
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
