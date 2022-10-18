import java.util.Scanner;

public class Q43_disarium_number {
    static int isCount(int n)
    {
        int count = 0;
        while (n!=0)
        {
            int rem = n % 10;
            count++;
            n =n /10;
        }
        return  count;
    }
    static int pow(int n , int p)
    {
        int pow = 1;
        while(p>0){
            pow = pow * n;
            p--;
        }
        return pow;
    }
    static boolean isArmstrong(int n){
        int sum =0;
        int temp = n;
        int p = isCount(n);
        while(n!=0)
        {
            int rem =  n% 10;
            sum = sum + pow(rem,p);
            n = n /10;
            p--;
        }
        return temp == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        boolean num = isArmstrong(x);
        if(num)
        {
            System.out.println(x+" "+"is a disarium number");
        }
        else{
            System.out.println(x+" "+"is not a disarium number");
        }
    }
}
