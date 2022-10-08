import java.util.Scanner;

public class how_many_prime_with_n {
    public static boolean prime(int x)
    {
        int fac = 0;
        for (int i = 1; i <= x; i++)
        {
            if (x % i == 0)
            {
                fac++;
            }
        }
        if (fac == 2)
        {

            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int pcount = 1;
        for(int i = 1 ; i<=x; i++)
        {
            boolean num = prime(i);
            if (num == true)
            {
                pcount++;

            }

        }
        System.out.println(pcount);
    }
}
