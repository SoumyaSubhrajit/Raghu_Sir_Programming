import java.util.Scanner;

public class Q39 {
public static void isWord(String str)
{
    int count=0;
    char ch[] = str.toCharArray();
    for(int i=0; i<ch.length; i++)
    {
        while(i<ch.length && ch[i]!=' ')
        {
            i++;
        }
        count++;
    }
    System.out.println(count);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        isWord(str);
    }
}