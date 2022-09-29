import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int x = sc.nextInt();
        if(x%400==0 || (x%4 ==0 && x%100 != 0)){
            System.out.println("it's a leap year");
        }
        else{
            System.out.println("ti's not a leap year");
        }
        }
    }

