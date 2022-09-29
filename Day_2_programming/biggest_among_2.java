import java.util.Scanner;

public class biggest_among_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter Second number");
        int y = sc.nextInt();
        if(x > y){
            System.out.println(x +" "+"is gretest number");
        }
        else {
            System.out.println(y+" "+" is the gretest number");
        }
    }
}
