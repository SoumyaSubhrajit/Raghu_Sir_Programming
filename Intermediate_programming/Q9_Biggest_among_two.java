import java.util.Scanner;

public class Q9_Biggest_among_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        if(a > b){
            System.out.println(a+" "+"is big");
        }
        if(a == b){
            System.out.println("both equal");
        }
        else{
            System.out.println(b+" "+"is big");
        }
    }
}
