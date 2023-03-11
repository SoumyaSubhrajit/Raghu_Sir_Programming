//  How many Small vowels in a string..

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int SmCount=0;
        for(int i=0;i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<= 'z')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    SmCount++;
                }
            }
        }
        System.out.println("Capital Vowel is: "+SmCount);
    }
}
