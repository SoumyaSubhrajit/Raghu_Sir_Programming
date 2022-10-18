import java.util.Scanner;

public class Q31_bimary_format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        String bin = "";
        while (n!=0)
        {
            int rem = n % 2;
            bin = rem + bin;
            n = n /2;
        }
        System.out.println(bin);
    }
}
