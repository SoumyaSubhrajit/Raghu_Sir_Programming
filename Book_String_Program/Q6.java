//

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int CpCount=0;
        int SmCount=0;
        for(int i=0;i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<= 'Z')
            {
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                {
                    CpCount++;
                }
            }
            if(ch>='a' && ch<= 'z')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    SmCount++;
                }
            }
        }
        System.out.println("Capital Vowel is: "+CpCount);
        System.out.println("Capital Vowel is: "+SmCount);

    }
}
