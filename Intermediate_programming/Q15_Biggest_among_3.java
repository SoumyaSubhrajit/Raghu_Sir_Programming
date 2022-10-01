import java.util.Scanner;

public class Q15_Biggest_among_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        if(a > b && a >c ){
            System.out.println(a+" "+"is biggest");
        }
        else if(b >c){
            System.out.println(b+" "+"is biggest");
        }
        else{
            System.out.println(c+" "+"is biggest");
        }
    }
}
