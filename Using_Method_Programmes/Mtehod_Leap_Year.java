import java.util.Scanner;

public class Mtehod_Leap_Year {
    static void leap_year(int x)
    {
        if(x %400 ==0 || (x%10 !=0 && x%4 ==0 ))
        {
            System.out.println("it's a leap year");
        }
        else {
            System.out.println("it's not a leap year");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        leap_year(x);
    }
}
