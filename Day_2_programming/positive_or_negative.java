import java.util.Scanner;

public class positive_or_negative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();
        if (input >= 0){
            System.out.println("your number is a positive number");
        }
        else{
            System.out.println("your number is a negative number");
        }

    }
}
