import java.util.Scanner;

public class Q20_fabonacci {
    public static void main(String[] args) {


        System.out.println("Enter a number that you want to see feb");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}