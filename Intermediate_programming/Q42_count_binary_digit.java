import java.util.Scanner;

public class Q42_count_binary_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;
        while(n!=0)
        {
            int rem = n % 2;
            if(rem == 1){
            count++;
            }
            n = n /2;
        }
        System.out.println(count);
    }
}
