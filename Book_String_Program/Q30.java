import java.util.Scanner;

public class Q30 {
    public static void isLast(String str)
    {
        char ch[] = str.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
            {
                if(ch[i]>='a' && ch[i]<='z'){

                }
            }
            else if(ch[i]>='a' && ch[i]<='z'){

                ch[i] = (char)(ch[i]-32);
            }
        }
        str = new String(ch);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        isLast(str);
    }

}
