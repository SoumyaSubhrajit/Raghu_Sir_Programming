import java.util.Scanner;

public class Q12_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if (a > 0)
        {
            if (a % 2 == 0) {
                System.out.println("This number is even");
            }
            else {
                System.out.println("This number is odd");
            }

        }
       else if (a<0)
        {
            if (a % 2 == 0) {
                System.out.println("This number is negative even number");
            }
            else {
                System.out.println("This number is negative odd number");
            }
        }
        else
        {
            System.out.println("Enter valid number");
        }
    }
}