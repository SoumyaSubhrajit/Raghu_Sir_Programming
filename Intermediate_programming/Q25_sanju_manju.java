import java.util.Scanner;

public class Q25_sanju_manju {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numeber");
        int x = sc.nextInt();
        if ( x%3==0 && x%5==0)
        {
            System.out.println("sanju weds manju");

        }
        else if( x % 3 == 0)
        {
            System.out.println("sanju");
        }
        else if( x % 5 ==0){
            System.out.println("geeta");
        }
        else{
            System.out.println("break up");
        }
    }
}
