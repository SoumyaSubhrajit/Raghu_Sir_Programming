import java.util.Scanner;

public class Equal_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter Second number");
        int y = sc.nextInt();
        if(x == y){
            System.out.println("The two number is equal");
        }
        if(x!= y){
            System.out.println("The two number are not equal");
        }
    }

        }


