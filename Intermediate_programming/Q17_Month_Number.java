import java.util.Scanner;

public class Q17_Month_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to show dates of a month");
        int x = sc.nextInt();
        if(x>0 && x<=12){
            if( x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12)
            {
                System.out.println("it's a 31 days month");
            }
            if(x == 4 || x == 6 || x == 9 || x ==11){
                System.out.println("it's a 30 days month");
            }
            if(x == 2)
            {
                System.out.println("it's feb 28 or 29 days month");
            }
        }
        else
        {
            System.out.println("invalid entry");
        }
    }
}
