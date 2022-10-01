import java.util.Scanner;

public class Q8_Equal_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        if(a  == b){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
