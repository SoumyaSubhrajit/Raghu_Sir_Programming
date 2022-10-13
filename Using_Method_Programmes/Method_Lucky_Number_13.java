import java.util.Scanner;

public class Method_Lucky_Number_13 {
    public static boolean lucky(int n)
    {
        int sum = 0;
        while(n > 9) {
            do {
                int rem = n % 10;
                sum = sum + rem * rem;
                n = n / 10;
            } while (n != 0);
            n = sum;
        }
        return  sum == 9;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        boolean num =  lucky(x);
        if(num == true){
            System.out.println("it'a Lucky number");
        }
        else{
            System.out.println("it's not Lucky number");
        }
    }
}
