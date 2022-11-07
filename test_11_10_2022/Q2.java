
// write a java program to print how many prime digits present 
// in the number? ex:2341 output:3 (2 3 and 1 is prime digits).

import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        while(n!=0)
        {
            int rem = n%10;
            int fac =0;
            for(int i=2;i*i<=rem; i++)
            {
                if(rem%i==0)
                    fac++;
            }
            if(fac==0)
                System.out.println(rem);
            n = n/10;
        }
    }
}