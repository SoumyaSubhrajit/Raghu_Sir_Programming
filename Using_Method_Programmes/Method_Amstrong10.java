import java.awt.*;
import java.util.Scanner;
public class Method_Amstrong10 {
    public static boolean amstrong(int x)
    {
        int sum = 0; int temp = x;
        int dc = isCount(x);
        do{
            int rem = x % 10;
            sum = sum + isPower(rem,dc);
             x = x /10;
        }while(x !=0);
        return sum == temp;
    }
    public static int isCount(int n)
    {
       int count = 0;
        while( n!= 0)
        {
            int rem = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }
    public static  int isPower(int n, int p )
    {
        int pw = 1;
        while (p>0){
            pw = pw * n;
            p--;
        }
        return pw;
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        boolean num = amstrong(x);
        if(num == true){
            System.out.println("it'a armstrong number");
        }
        else{
            System.out.println("it's not a armstrong number");
        }
    }
}
