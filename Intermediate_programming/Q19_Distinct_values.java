import java.util.Scanner;

public class Q19_Distinct_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        if (a != b && a != c)
        {
            if (a < b && a < c)
            {
                if (b < c)
                {
                    System.out.println(b);
                } else
                {
                    System.out.println(c);
                }
            }
            else if (b < a && b < c)
            {
                if (a < c)
                {
                    System.out.println(a);
                }
                else
                {
                    System.out.println(c);
                }
            }
            else if (c < a && c < b)
            {
                if (a < b)
                {
                    System.out.println(a);
                } else
                {
                    System.out.println(b);
                }
            }

        }
        else
        {
            System.out.println("Please enter distinct values");
        }
    }
}