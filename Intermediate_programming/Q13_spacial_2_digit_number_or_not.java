import java.util.Scanner;

public class Q13_spacial_2_digit_number_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if (a < 100) {
            int cons = a / 10;
            int rem = a % 10;
            int temp = cons * rem + cons + rem;

            if (temp == a) {
                System.out.println("it's a special number");
            } else {
                System.out.println("it's not a special number");
            }
        }
        else{
            System.out.println("Plz enter two digit number");
        }
    }
}