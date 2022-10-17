import java.util.Scanner;

public class happy_number_within_n{
    static  boolean isHappy(int n){
        while(n>9){
            int sum = 0;
            while (n!=0){
                int rem = n % 10;
                sum = sum + rem * rem;
                n = n /10;
            }
            n = sum;
        }
        return n == 1 || n == 7;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range of your number");
        int  x = sc.nextInt();
        for(int i = 1; i<=x; i++)
        {
            boolean num = isHappy(i);
            if(num){
                System.out.println(i);}
        }

    }
}