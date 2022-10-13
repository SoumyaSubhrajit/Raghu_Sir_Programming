import java.util.Scanner;
public class Method_reverse {
    public static int reverse(int n){
        int prod = 0;
        while( n!=0)
        {
            int rem = n % 10;
            prod = prod * 10 + rem;
            n = n/ 10;
        }
        return  prod;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
       int rev =  reverse(x);
        System.out.println(rev);
    }
}