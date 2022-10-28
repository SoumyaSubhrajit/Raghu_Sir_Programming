import java.util.Scanner;

public class p23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int x = 1;
        for(int i = 1; i<=n; i++)
        {
            for(int j =1; j<=n; j++)
            {
                if(x==10){
                    x = 1;
                }
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
