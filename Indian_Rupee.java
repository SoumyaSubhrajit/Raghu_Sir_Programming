import java.util.Scanner;

public class Indian_Rupee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amt = sc.nextInt();
        System.out.println("2000 rs: "+ amt/2000);
        amt = amt % 2000;
        System.out.println("500 rs: "+ amt/500);
        amt = amt % 500;
        System.out.println("200 rs: "+ amt/200);
        amt = amt % 200;
        System.out.println("100 rs: "+ amt/100);
        amt = amt % 100;
        System.out.println("50 rs: "+ amt/50);
        amt = amt % 50;
        System.out.println("20 rs: "+ amt/20);
        amt = amt % 20;
        System.out.println("10 rs: "+ amt/10);
        amt = amt % 10;
        System.out.println("5 rs: "+ amt/5);
        amt = amt % 5;
        System.out.println("2 rs: "+ amt/2);
        amt = amt % 2;
        System.out.println("1 rs: "+ amt/1);

    }
}
