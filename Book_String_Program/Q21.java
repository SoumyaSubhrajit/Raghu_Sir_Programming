import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int SP = 0;
        int digit = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
            {
            }
            else if(ch>=48 &&ch<=57){
                digit++;
            }
            else{
                SP++;
            }
        }
        System.out.println("Special Charecter are-->"+SP);
        System.out.println("digits are-->"+digit);
    }
}
