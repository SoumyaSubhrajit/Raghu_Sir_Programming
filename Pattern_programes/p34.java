import java.util.Scanner;

public class p34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sp =0;
        int st =n;
        for(int i=1 ; i<=n; i++)  // starting from 7 to 1
        {

            for(int j=1; j<=sp;j++)
            {
                System.out.print("  ");
            }
            int x  = n-3-sp;
            for(int j=1 ; j<=st; j++)
            {
                System.out.print(x+" ");
                if(j<=st/2)
                {
                    x--;
                }
                else{
                    x++;
                }              // work in oly in odd num input...
            }
            if(i<=n/2)
            {
                sp++;
                st = st-2;
            }
            else{
                sp--;
                st = st+2;    }
            System.out.println();
        }
    }
}
