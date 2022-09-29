import java.util.Scanner;

public class Swapping_2_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        System.out.println("your number before swapping is: "+x+" "+y);
        int temp = 0;
         temp = x;
        x = y;
       y = temp;
        System.out.println("your number after swapping is: "+x+" "+y);
    }
}
