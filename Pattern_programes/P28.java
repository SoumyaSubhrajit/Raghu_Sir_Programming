import java.util.Scanner;

public class P28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sp=n/2;
        int st=1;
        for(int i=1 ;i<=n; i++)
        {
            int x= 1;
            for(int j=1; j<=sp; j++)
            {
                System.out.print("  ");
            }
            for(int j =1; j<=st; j++)
            {
                System.out.print(x+" ");

                if(j<=st/2)
                {
                    x++;
                }
                else {
                    x--;
                }
            }
            if(i<=n/2){
                sp--;
                st= st +2;
            }
            else{
                sp++;
                st =st-2;
            }
            System.out.println();
        }
    }

}
