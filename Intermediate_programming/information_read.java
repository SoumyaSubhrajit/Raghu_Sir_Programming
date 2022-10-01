import java.util.Scanner;

public class information_read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("Enter the mobile number: ");
        long number = sc.nextLong();
        System.out.println("Enter 10th percentage: ");
        double perc1 = sc.nextDouble();
        System.out.println("Enter 12th percentage: ");
        double perc2 = sc.nextDouble();
        System.out.println("Enter Degree percentage: ");
        double perc3 = sc.nextDouble();
        System.out.println("name: "+" "+name);
        System.out.println("Mobile Number: "+" "+number);
        System.out.println("10th: "+" "+perc1);
        System.out.println("12th: "+" "+perc2);
        System.out.println("Degree: "+" "+perc3);
    }
}
