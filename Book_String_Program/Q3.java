import java.util.Scanner;

// small letter present in the String
// Input: DhArWaDa
// output: 4
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int SmCount=0;
        for(int i=0; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                SmCount++;
            }
        }
        System.out.println("  Small Letter is: "+SmCount);
    }
    }

