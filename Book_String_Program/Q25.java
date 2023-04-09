import java.util.Scanner;

public class Q25 {
    public static String isUpper(String str)
    {
        char ch[] = str.toCharArray();
        for(int i=0; i< ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z'){
                ch[i] = (char)(ch[i]+-32);
            }
        }
        str = new String(ch);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String res = isUpper(str);
        System.out.println(res);
    }
}
