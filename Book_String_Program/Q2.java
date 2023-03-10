
// Input: BanGaLore (count Captial and samll letter)
// Output: Capital letter is: 3
        //    Small Letter is: 6

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int CpCount=0;
        int SmCount=0;
        for(int i=0; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                CpCount++;
            }
            if(ch>='a' && ch<='z')
            {
                SmCount++;
            }
        }
        System.out.println(" Capital letter is: "+CpCount);
        System.out.println("  Small Letter is: "+SmCount);
    }

}
