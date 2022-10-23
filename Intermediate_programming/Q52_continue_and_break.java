import java.util.Scanner;

public class Q52_continue_and_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Break part:");
        for(int i = 1; i<=n; i++)
        {
            if(i ==4){
                break;}
            System.out.println(i);
        }
        System.out.println("Continue part: ");
        for (int i=1; i<=n; i++)
        {
            if(i ==2)
                continue;
            System.out.println(i);
        }
    }
}
