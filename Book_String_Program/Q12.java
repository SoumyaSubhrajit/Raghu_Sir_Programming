// how maney Speical charecter and letter in a string..
// input: shiv>va<#mo$gga@
// output: Letters are --> 11
//          Special Characters are --> 5

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int LeCount = 0;
        int SPCount=0;
        for(int i=0; i< str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
            {
                LeCount++;
            }
            else {
                SPCount++;
            }
        }
        System.out.println("Letters count: "+LeCount);
        System.out.println("Special characters  count: "+SPCount);
    }
}
