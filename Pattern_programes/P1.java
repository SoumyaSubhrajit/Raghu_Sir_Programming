import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 1; i<n; i++) // for n times loop(column loop)
        {
            for(int j = 1; j<= n-i; j++)
            {
                System.out.print("  "); // loop for the space..
            }
            for (int j =1 ; j<=(2 * i -1); j++ )
            {
                System.out.print(j%2+" ");  //For printing "*".
            }
            System.out.println();
        }

    }
}
