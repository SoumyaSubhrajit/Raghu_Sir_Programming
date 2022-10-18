import java.util.Scanner;

public class Q34_xylem_pholem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int arb = 0;
        arb = n %10;
        n = n /10;
        int sum = 0;
        while( n>10 )
        {
            int rem = n % 10;
            sum = sum + rem;
            n = n/ 10;
        }
        arb = arb + n;
        if(arb == sum){
            System.out.println("it's xylem number");}
        else{
            System.out.println("it's a phloem number");
        }

    }
}
