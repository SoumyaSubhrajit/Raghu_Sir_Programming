import java.util.Scanner;

public class Q38 {
    public static void isLF(String str)
    {
        char ch[] = str.toCharArray();
        int k=0;
        for(int i=0 ; i< ch.length;i++)
        {
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
            {
               k = i;
            }
            else if(i== ch.length-1 && ch[i]!=' ' || ch[i+1]==' ')
            {
                char temp = ch[k];
                ch[k] = ch[i];
                ch[i] = temp;
            }
        }
        str = new String(ch);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        isLF(str);
    }
}
