import java.util.Scanner;

public class Q45_method_returmn_n {
    static int isPower(int n , int p){
        int pow = 1;
        while (p>0){
            pow = pow * n;
            p--;
        }
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter the power of that number");
        int p = sc.nextInt();
        int num = isPower(n,p);
        System.out.println(num);
    }
}
