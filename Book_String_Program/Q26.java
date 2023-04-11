import java.util.Scanner;

public class Q26 {
    public static String isVowel(String str)
    {
        char ch[] = str.toCharArray();
        for(int i=0; i< ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            {
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){

                }
                else{
                    ch[i] = (char)(ch[i]-32);
                }
            }

        }
        str = new String(ch);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String res = isVowel(str);
        System.out.println(res);
    }
}
