import java.util.Scanner;

public class Q24_Amstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp1 = n;
        int temp2 = n;
        int count = 0;
        while ( temp1!= 0)
        {
            int rem = temp1 % 10;
            count++;
             temp1= temp1 /10;
        }
        int sum =0;
        while(temp2!=0)
        {

            int rem2 = temp2 % 10;
            int pw = 1;
            int count2 = count;
            while( count2 > 0)
            {
                 pw = pw * rem2;
                 count2--;
            }
            sum = sum + pw;
            temp2 = temp2 / 10;
        }
        System.out.println(sum);
        if(sum == n)
        {
            System.out.println(n+" "+"It's a Armstrong Number");
        }
        else {
            System.out.println(n+" "+"It's Not a Armstrong Number");
        }
    }
}
