import java.util.Scanner;

public class Q36 {
    public static void isReverse(String str)
    {
        char ch[] = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j)
        {
           char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        str = new String(ch);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
       isReverse(str);
    }
}
