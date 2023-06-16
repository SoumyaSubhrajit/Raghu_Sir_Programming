import java.util.Scanner;

public class Q43 {
    public static void isCountW(String str)
    {
        int count=0;
        int wordC = 0;
        String rs = "";
        char ch[] = str.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            while(i<ch.length && ch[i]!=' ')
            {
                rs = rs +ch[i];
                wordC++;
                i++;
            }
            System.out.print(wordC+" ");
            wordC = 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
isCountW(str);
    }
}
