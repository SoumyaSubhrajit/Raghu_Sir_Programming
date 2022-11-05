import java.util.Scanner;

public class p38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sp =1;
        for(int i =1; i<=n;i++)
        {
            for(int j=1; j<=n; j++)
            {
                if( j== n/2+1 || i==n/2+1 || i==j ||i+j==n+1 ){
                System.out.print("* ");}
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
