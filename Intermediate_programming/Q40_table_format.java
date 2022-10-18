import java.util.Scanner;

public class Q40_table_format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++)
        {
            int temp = n*i;
            System.out.println(n+" "+"*"+" "+i+" "+"="+" "+temp);
        }
    }
}
