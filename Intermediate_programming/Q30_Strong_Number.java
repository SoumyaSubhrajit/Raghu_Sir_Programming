import java.util.Scanner;

public class Q30_Strong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp= n;
        int sum = 0;
        while( n!= 0)
        {
            int rem = n % 10;
            int fac= 1;
            while(rem>0)
            {
               fac = fac * rem;
               rem--;
            }
            sum = sum + fac;
            n = n /10;
        }
        if( sum == temp)
        {
            System.out.println(temp+" "+"It is a Strong Number");
        }
       else {
            System.out.println(temp+" "+"It is Not a Strong Number");
        }
    }
}
