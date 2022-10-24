import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int x = n;
        int y =n;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j< n*2; j++)
            {
                if(j<=x){
                    System.out.print(i);
                }
                else if(j>=y){
                    System.out.print(n = 2-j);
                }
                else {
                    System.out.print(" ");
                }
            }
            x--;
            y++;
            System.out.println();
        }

    }
}
