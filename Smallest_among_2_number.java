import java.util.Scanner;

public class Smallest_among_2_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter Second number");
        int y = sc.nextInt();
        int small = x;
        if(small > y) {
            small = y;
        }
        System.out.println("the small among two number is"+" "+ small);

    }
}
