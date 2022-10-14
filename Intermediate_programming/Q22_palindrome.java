import java.util.Scanner;

public class Q22_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");  // 545
        int n = sc.nextInt();
        int sum = 0;
        while( n!=0 )
        {
            int rem = n % 10; // rem = 5
            sum = sum * 10 +rem; // sum = 0 + 5 = 5
            n = n/ 10;  // n  = 545 /10 = 54
        }
        if( sum  == n ){
            System.out.println("it's a palindrome number");
        }
        else{
            System.out.println("it's NOT a palindrome number");
        }
    }
}
