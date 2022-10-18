import java.util.Scanner;

public class Q33_Duck_number {
static int  isReverse(int n){
    int rev = 0;
    while(n!=0){
        int rem = n % 10;
        rev = rev *10 + rem;
        n = n/10;
    }
    return rev;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int revv = isReverse(n);
        int ct=0;
        int firDig=0;
        if (revv > 0)
        {     firDig= revv%10;


            while (n !=0)
            {
                int rem = n % 10;
                if(rem==0){
                    ct++;
                }
                n = n / 10;
            }
        }
        if ( firDig== 0) {
            System.out.println("it's not duck number");

        } else if( firDig !=0 && ct ==1){
            System.out.println("it's a duck number");
        } else if (firDig !=0 && ct >1 || firDig ==0 && ct >1) {
            System.out.println("it's not duck number");
        }
    }
}