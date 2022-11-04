import java.util.Scanner;
public class p37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int x=1;
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=n;j++)
            {

                if(i==1 || i==n || j==1 || j==n ||i==4 ||j==4 || (x%2==1 && i<4) || (x%2==0 && i>4))
                    System.out.print("x ");
                else
                    System.out.print("  ");

                x++;
            }
            System.out.println();
        }
    }

}