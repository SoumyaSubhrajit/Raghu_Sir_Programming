import java.util.Scanner;
public class test_5_biggest_digit_in_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int big = 0;
        while( n != 0 )
        {
            int rem = n % 10;
            if( rem > big){
                big = rem; }
            n = n /10;
        }
        System.out.println(big);
    }
}
