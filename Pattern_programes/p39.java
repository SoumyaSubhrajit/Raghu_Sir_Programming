import java.util.Scanner;

public class p39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            for(int j=1; j<=2*(n-i)-1;j++)
            {
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                if(j==n)
                    continue;
              System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
