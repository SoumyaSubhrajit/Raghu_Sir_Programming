import java.util.Scanner;

public class Biggest_among_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int x= sc.nextInt();
        System.out.println("Enter the Sec integer");
        int y = sc.nextInt();
        if(x>=y){
            System.out.println(x + " "+ "is the biggest number");
        }
        if(x<y){
            System.out.println(y + " "+ "is the biggest number");
        }
    }
}
