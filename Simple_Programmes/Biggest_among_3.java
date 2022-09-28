import java.util.Scanner;

public class Biggest_among_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int x= sc.nextInt();
        System.out.println("Enter the Sec integer");
        int y = sc.nextInt();
        System.out.println("Enter the third integer");
        int z = sc.nextInt();
        int big = x;
        if(y>big){
            big = y;
            if (z > big){
                big = z;
            }
        }
        System.out.println("The biigest number among the 3 is "+" "+big);
    }
}
