import java.util.Scanner;

public class Q29_Emirp
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int temp = n;
        int fac1 = 0;
        int fac2 = 0;
        for (int i = 2; i*i<=n;i++)
        {
            if(n%i == 0)
            {
                fac1++;
                break;
            }
        }

        if(fac1 == 0)
        {
            int rev = 0;
            while( n!= 0)
            {
                int rem = n%10;
                rev = rev * 10 +rem;
                n = n/ 10;
            }
            for (int i = 2; i*i<=rev;i++)
            {
                if(rev%i == 0)
                {
                    fac2++;
                    break;
                }
            }
            if(fac2==0)
            {

                System.out.println(temp+" "+"Is a Emirp Number");
            }

        }
        else {
            System.out.println(temp+" "+"Is Not a Emirp Number");
        }


    }
}
