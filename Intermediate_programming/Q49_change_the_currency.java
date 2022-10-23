import java.util.Scanner;

public class Q49_change_the_currency {
    public static  double getusDoler(Double n)
    {
        double doller = 82.53;
        return doller * n;
    }
    public static  double geteuro(Double n)
    {
        double euro = 80.98;
        return euro  * n;
    }
    public static  double getRupee(Double n){
        double rupee = n;
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = sc.nextDouble();
        double res1 =  getusDoler(num);
        double res2 =  geteuro(num);
        double res3 =  getRupee(num);
        System.out.println("$"+res1);
        System.out.println(+res2+"Euro");
        System.out.println(+res3);


    }
}
