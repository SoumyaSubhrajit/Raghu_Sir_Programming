// How many Captial Ovels in a string..
// intput: prOgrammIng
//  Output: 2

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int CpCount=0;
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
        }
        System.out.println("Capital Vowel is: "+CpCount);
    }
}
