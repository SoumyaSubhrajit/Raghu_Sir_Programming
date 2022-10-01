import java.util.Scanner;

public class Q16_Day_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if(x>0 && x<=7){
            if(x==1){
                System.out.println("Sunday");
            } else if (x==2) {
                System.out.println("Monday");
            } else if (x==3) {
                System.out.println("Tuesdaay");
            } else if (x==4) {
                System.out.println("Wednesday");
            } else if (x==5) {
                System.out.println("Thursday");
            } else if (x==6) {
                System.out.println("Friday");
            } else if (x==7) {
                System.out.println("Saturday");
            }
        }
        else {
            System.out.println("Enter a valid input");
        }
    }
}
