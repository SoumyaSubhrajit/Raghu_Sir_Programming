import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int le = 0;
        int digit = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
            {
                le++;
            }
            else if(ch>=48 &&ch<=57){
                 digit++;
            }
        }
        System.out.println("Letters are-->"+le);
        System.out.println("digits are-->"+digit);
    }
}
