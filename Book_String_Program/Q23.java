import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int Small = 0;
        int SP = 0;
        int digit = 0;
        for(int i = 0; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='B')
            {

            }
            else if(ch>='a' && ch<='z'){
                Small++;
            }
            else if(ch>=48 && ch<=57)
            {
                digit++;
            }
            else {
                SP++;
            }
        }
        System.out.println("Small Letters are: "+Small);
        System.out.println("Special Characters are: "+SP);
        System.out.println("Digits are: "+digit);
    }
}
