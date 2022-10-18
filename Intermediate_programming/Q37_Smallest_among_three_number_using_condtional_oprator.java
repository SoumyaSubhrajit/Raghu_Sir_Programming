import java.util.Scanner;

public class Q37_Smallest_among_three_number_using_condtional_oprator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        int small=(a<b && a<c)?a:b<c?b:c;
        System.out.println(small);
    }
}
