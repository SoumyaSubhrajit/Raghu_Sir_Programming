import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int Cap = 0;
        int SP = 0;
        int digit = 0;
        for(int i=0; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                Cap++;
            }
            else if(ch>='a' && ch<='b')
            {

            }
            else if(ch>=48 && ch<=57)
            {
                digit++;
            }
            else{
                SP++;
            }
        }
        System.out.println("Capital Letters are: "+Cap);
        System.out.println("Special characters are: "+SP);
        System.out.println("Digits are: "+digit);

    }
}
