import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) // for n times loop(column loop)
        {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // loop for the space..
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
                if(j<i)
                {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }
}
