import java.util.Scanner;

public class Q41 {
    public static void isReverse(String str)
    {
        char ch[] =str.toCharArray();
        int k = 0;
        String rs ="";
        for(int i=0; i<ch.length;i++)
        {
            k = i;
            while (i< ch.length && ch[i] != ' ')
            {
                i++;
            }
            int j = i - 1;
            while (j >= k)
            {
                rs = rs + ch[j];
                j--;
            }
            if (i < ch.length) {
                rs = rs + ch[i];
            }
        }
        System.out.println(rs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        isReverse(str);
    }
}
