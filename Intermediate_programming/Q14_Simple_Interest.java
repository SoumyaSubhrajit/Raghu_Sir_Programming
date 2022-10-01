import java.util.Scanner;

public class Q14_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amount = sc.nextInt();
        System.out.println("Enter interst rate");
        int interest = sc.nextInt();
        System.out.println("Enter your time period");
        int time = sc.nextInt();
        double SI = (amount * interest * time)/100;
        System.out.println("Your SI is:"+" "+SI);

    }
}
