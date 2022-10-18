import java.util.Scanner;

public class Q38_perfect_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fac= 0;
        int i = 1;
        int sum = 0;
        while(i<n)
        {
            if(n%i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(n == sum)
        {
            System.out.println("perfect number");
        }
        else{
            System.out.println("it's not a perfect number");
        }
    }
}
