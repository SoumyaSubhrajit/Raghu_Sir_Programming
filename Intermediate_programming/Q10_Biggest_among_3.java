import java.util.Scanner;

public class Q10_Biggest_among_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        int big= a;
        if(a<b){
            big = b;
        }
        if(b<c){
            big = c;
        }
        System.out.println(big+" "+"is the biggest");

        }

    }
