import java.util.Scanner;

public class Length_btw_2_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        String s1 = sc.next();
        System.out.println("Enter the second name");
        String s2 =sc.next();
        if(s1.length() > s2.length()){
            System.out.println(s1+" "+ "have the highest length");
        }
        if(s1.length() == s2.length()){
            System.out.println(s1+" "+s2+" "+ "have same length");
        }
        else {
            System.out.println(s2+" "+ "have the highest length");

        }

    }
}
