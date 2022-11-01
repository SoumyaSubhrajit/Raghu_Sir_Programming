import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sp=1;
        int st=n;
        for(int i=1 ;i<=n; i++)
        {
            int x=i;
            for(int j=1; j<=sp; j++)
            {
                System.out.print("  ");
            }
            for(int j =1; j<=st; j++)
            {
                System.out.print((char) (x+64)+" ");

                if(j<=st/2)
                {
                    x++;
                }
                else {
                    x--;
                }
            }
            if(i<=n/2){
                sp++;
                st= st -2;
            }
            else{
                sp--;
                st =st+2;
            }
            System.out.println();
        }
    }
}
