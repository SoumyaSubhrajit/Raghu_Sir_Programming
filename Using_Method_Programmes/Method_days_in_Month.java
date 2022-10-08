import java.util.Scanner;

public class Method_days_in_Month
{
    static int days_in_month(int x) {
        if (x > 0 || x <= 12)
        {
            if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 ||
                    x == 12) {
                return 31;
            } else if (x == 4 || x == 6 || x == 9 || x == 11) {
                return 30;
            } else if (x == 2) {
                return 28;
            }
        }
        else
        {
            return 0;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of month");
        int x = sc.nextInt();
        int num  = days_in_month(x);
        if(num == 31)
        {
            System.out.println("it's a 31 days month");
        }
        else if(num == 30)
        {
            System.out.println("it's a 30 days month");
        }
        else if(num == 28)
        {
            System.out.println("it's feb month");
        } else if (num == 0) {
            System.out.println("invalid number");
        }
    }
}
