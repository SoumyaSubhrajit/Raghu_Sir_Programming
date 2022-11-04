import java.util.Scanner;

public class p35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sp=n/2;
        int st = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=st; j++)
            {
                if(i%2!=0)
                {
                    if(j%2==0)
                    {
                        System.out.print("  ");
                        continue;
                    }
                }
                System.out.print("* ");
            }
            if(i<=n/2)
            {
                sp--;
                st= st+2;
            }
            else{
                sp++;
                st = st-2;
            }
            System.out.println();
        }
    }
}
