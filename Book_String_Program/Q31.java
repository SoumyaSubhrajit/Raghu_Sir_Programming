// RAMA IS A GOOD BOT
// ramA iS A gooD boY

import java.util.Scanner;

public class Q31 {
    public static void isLast(String str)
    {
        char ch[]  = str.toCharArray();
        for(int i=0 ; i< ch.length; i++)
        {
            if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ') {
                if (ch[i] >= 'A' && ch[i] <= 'Z') {

                }
            }


            else if(ch[i]>='A' && ch[i]<='Z')
                {
                    ch[i] = (char)(ch[i]+32);
                }
        }
        str=new String(ch);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        isLast(str);
    }
}
