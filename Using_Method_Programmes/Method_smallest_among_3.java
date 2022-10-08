import java.util.Scanner;

public class Method_smallest_among_3 {
    static int smallest(int x , int y, int z)
    {
        if(x < y && x < z)
        {
            return x;
        }
        else if (y < z)
        {
            return y;
        }
        else
        {
            return z;
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int x  = sc.nextInt();
        System.out.println("Enter the second number");
        int y  = sc.nextInt();
        System.out.println("Enter the third number");
        int z = sc.nextInt();
        int num = smallest(x , y , z);
        System.out.println("the smallest number is: "+" "+num);
    }
}
