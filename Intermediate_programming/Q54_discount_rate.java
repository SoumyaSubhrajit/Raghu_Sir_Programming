import java.util.Scanner;

public class Q54_discount_rate {
    static int isDiscount(int x , int y){
        int dis = 0;
        dis = x - y;
        return dis;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of the product");
        int x = sc.nextInt();
        System.out.println("Enter the percentage discount rate %");
        int y  = sc.nextInt();
        int sum = isDiscount(x,y);
        System.out.println("the discount rate is: "+sum);
    }
}
