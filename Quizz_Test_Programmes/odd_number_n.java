import java.util.Scanner;

// write a java print odd number from n to 1
public class odd_number_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            if(i%2==0){

            }
            else {
                System.out.println(i);
            }
        }
    }
}
