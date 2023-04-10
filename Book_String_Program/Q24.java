import java.util.Scanner;

public class Q24 {
    public static String isLower(String str)
    {
        char ch[] = str.toCharArray();
        for(int i = 0; i< ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z'){
            ch[i] =(char)(ch[i]+32);}
        }
        str = new String(ch);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String res = isLower(str);
        System.out.println(res);
    }
}
