import java.util.Scanner;

public class Method_Diserium_11 {
    public static boolean diserium(int x)
    {
        int sum = 0; int temp = x;
        int dc = isCount(x);
        do{
            int rem = x % 10;
            sum = sum + isPower(rem,dc);
            x = x /10;
            dc--;
        }while(x !=0);
        return sum == temp;
    }
    public static int isCount(int n)
    {
        int count = 0;
        while( n!= 0)
        {
            int rem = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }
    public static  int isPower(int n, int p )
    {
        int pw = 1;
        while (p>0){
            pw = pw * n;
            p--;
        }
        return pw;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        boolean num =  diserium(x);
        if(num == true){
            System.out.println("it'a diserium number");
        }
        else{
            System.out.println("it's not diserium number");
        }
    }
}
