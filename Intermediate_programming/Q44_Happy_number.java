import java.util.Scanner;

public class Q44_Happy_number {
    static boolean isHappy(int n){
        while(n>9)
        {
            int sum = 0;
            while(n!=0)
            {
                int rem = n % 10;
                sum = sum +rem * rem;
                n = n/10;
            }
            n = sum;
        }
        return n == 7 || n ==1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean num = isHappy(n);
        if(num){
            System.out.println("Congratulation!! it's a Happy number");
        }
        else{
            System.out.println("it's a not a happy number");
        }
    }
}
