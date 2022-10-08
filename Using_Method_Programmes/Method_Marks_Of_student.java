import java.awt.*;
import java.util.Scanner;

public class Method_Marks_Of_student {
    static void marks(int x , int y , int z ,int a)
    {
        if(x > 33 && y >33  && z > 33 && a > 33 )
        {
            float total = x + y + y + a;
            float per = (float)((total /400) * 100);
            System.out.println("Your perc is: "+per+"%");
            if(per > 90.0)
            {
                System.out.println("Distinction");
            }
            else if( per < 90.0 && per > 75.0)
            {
                System.out.println("first A class");
            }
            else if(per < 75.0 && per > 60.0)
            {
                System.out.println("First class");
            }
            else if(per < 60.0 && per > 45.0)
            {
                System.out.println("Second class");
            }
            else if(per <45.0 && per > 33.00)
            {
                System.out.println("Third class");
            }
        }
        else
        {
            System.out.println("You fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your MATH mark: ");
        int x = sc.nextInt();
        System.out.println("Enter your PHY mark: ");
        int y = sc.nextInt();
        System.out.println("Enter your CHEM mark: ");
        int z = sc.nextInt();
        System.out.println("Enter your ENG mark: ");
        int a = sc.nextInt();
        marks(x ,y , z ,a);

    }
}
