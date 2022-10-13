import java.util.Scanner;

public class Method_Strong_number_13 {
    public static boolean strong(int n)
    {
        int sum = 0; int temp = n;
        while(n!=0)
        {
            int rem = n %10;
            sum = sum+ getFact(rem);
            n  = n /10;
        }
        return sum == temp;
    }
    public static int getFact(int n)
    {
        int fac = 1;
        while(n > 0){
            fac = fac * n;
            n--;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        boolean num =  strong(x);
        if(num == true){
            System.out.println("it'a Strong number");
        }
        else{
            System.out.println("it's not Strong number");
        }
    }
}
