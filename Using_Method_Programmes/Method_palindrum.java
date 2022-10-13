import java.util.Scanner;
public class Method_palindrum {
    public static boolean palen(int n){
        int rev = 0; int temp = n;
        do{
            int rem = n % 10;
            rev = rev *10 + rem;
            n = n/ 10;
        }while(n !=0);
            return rev == temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        boolean num = palen(x);
        if(num == true)
            System.out.println("it's a palindrum number");
        else
            System.out.println("it's not a palindrum number");

    }
}
