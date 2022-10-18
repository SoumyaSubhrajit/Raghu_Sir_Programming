import java.util.Scanner;

public class Q39_differnce_between_sumOfEven_sumOFOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int EvenSum = 0;
        int OddSum = 0;
        while(n!=0)
        {
            int rem= n %10;
            if(rem%2 ==0)
            {
                EvenSum = EvenSum +rem;
            }
            else{
                OddSum = OddSum +rem;
            }
            n = n/10;
        }
        int result = OddSum - EvenSum;
        if( result < 0){
            result  = result *-1;
        }
        System.out.println(result);
    }
}
