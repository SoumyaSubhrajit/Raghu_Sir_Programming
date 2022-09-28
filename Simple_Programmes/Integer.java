import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the integer value");
        int n = sc.nextInt();
        if(n<0) {
            n = n * -1;
        }
        System.out.println("Enter number is "+n);
        }
    }

