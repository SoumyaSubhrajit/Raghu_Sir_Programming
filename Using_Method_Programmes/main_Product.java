import java.util.Scanner;

public class main_Product {
    static int Product(int p)
    {
        int pro = 1;
        int n = p;
        while(n>0)
        {
            pro = pro * n;
            n--;
        }
          return pro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int product = Product(num);
        System.out.println("Your Product of digit is: "+" "+product);
    }
}
