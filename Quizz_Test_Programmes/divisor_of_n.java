import java.util.Scanner;

//write java program to print all the divisors of n....
public class divisor_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            if(n%i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
