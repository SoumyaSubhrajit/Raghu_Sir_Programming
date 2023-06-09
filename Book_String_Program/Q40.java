import java.util.Scanner;

public class Q40 {
    public static int[] isFreq(String str) {
        int count[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 97]++;
            } else if (ch >= 'A' && ch <= 'Z') {
                count[ch - 65]++;
            }
        }
        return count;
    }
    public static boolean isAna(String str1 , String str2)
    {
        int[] ch1 = isFreq(str1);
        int[] ch2 = isFreq(str2);
        for(int i=0;i< 26;i++)
        {
            if(ch1[i]!=ch2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd String: ");
        String str2 = sc.nextLine();
        boolean res= isAna(str1,str2);
        if(res)
        {
            System.out.println("Hoooreh!! your string is a anagram");
        }
        else{
            System.out.println("Better luck next time");
        }
    }
}
