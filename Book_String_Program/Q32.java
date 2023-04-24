import java.util.Scanner;

public class Q32 {
    public static void isCount(String str)
    {
        int sum=0;
        for(int i=0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>=48 && ch<=57){
            sum = sum +(ch-48); }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
       isCount(str);

    }
}

