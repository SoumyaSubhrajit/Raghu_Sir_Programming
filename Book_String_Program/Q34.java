import java.util.Scanner;

public class Q34 {
    public static void isLower(String str)
    {
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            {
                ch[i] = (char)(ch[i]+32);
            }
        }
        str = new String(ch);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        isLower(str);
    }
}
