import java.util.Scanner;

// Input: BanGalore (count Captial letter)
// Output: 3
public class Q1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int CpCount = 0;
        for(int i=0; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch<= 'Z')
            {
                CpCount++;
            }
        }
        System.out.println("Upper case letter in the given String is: "+CpCount);
    }
}