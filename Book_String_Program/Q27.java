import java.util.Scanner;

// shivamogga
// shivAmOggA
public class Q27
{
    public static void isVowel1(String str)
    {
        char ch[]  =str.toCharArray();
        for(int i=0; i<ch.length;i++)
        {

               if(ch[i]>='a' && ch[i]<='z')
                {
                    if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                        ch[i] = (char)(ch[i]-32);
                    }
                }
            }
        str = new String(ch);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=  sc.nextLine();
        isVowel1(str);
    }
}
