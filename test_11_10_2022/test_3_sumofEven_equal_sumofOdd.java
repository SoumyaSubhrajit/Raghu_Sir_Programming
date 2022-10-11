import java.util.Scanner;
public class test_3_sumofEven_equal_sumofOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp1 = 0;
        int temp2 = 0;
        while( n!= 0 )
        {
            int rem = n % 10;
            if( rem % 2 == 0)
            {
                temp1 = temp1 + rem;
            }
            else{
                temp2 = temp2 +rem;
            }
            n = n/10;
        }
        if( temp1 == temp2)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }

}
