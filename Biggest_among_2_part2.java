import java.util.Scanner;

public class Biggest_among_2_part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int x= sc.nextInt();
        System.out.println("Enter the Sec integer");
        int y = sc.nextInt();
         int big = x;
         if(y>big){
             big = y;
         }
         System.out.println("the biggest number is"+ " "+big);

    }
}
