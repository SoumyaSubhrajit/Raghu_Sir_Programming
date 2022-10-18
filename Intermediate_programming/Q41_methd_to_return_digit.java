import java.util.Scanner;

public class Q41_methd_to_return_digit {
    static int isAvarge(int n){
        int count = isDigitCount(n);
        int sum = 0;
        while(n!=0)
        {
            int rem = n % 10;
            sum = sum + rem;
            n = n /10;
        }
        return sum/count;
    }
    static  int isDigitCount(int n){
        int count =0;
        while (n!=0)
        {
            int rem = n%10;
            count++;
            n  = n /10;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int avarge = isAvarge(n);
        System.out.println(avarge);
    }
}
