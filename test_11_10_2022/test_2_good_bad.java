import java.util.Scanner;
public class test_2_good_bad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        while( n!=0 )
        {
            int rem = n % 10;
            if( rem % 2 == 0)
            {
                count1++;
            }
            else{
                count2++;
            }
            n = n/10;
        }
        if( count1 == count2 )
        {
            System.out.println("good");
        }
        else{
            System.out.println("bad");
        }
    }
}
