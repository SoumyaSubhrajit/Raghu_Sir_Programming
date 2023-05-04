import java.util.Scanner;

public class Q37 {
    public static boolean  isPal(String str)
    {
        int i = 0;
        int j =str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j)){
                return false;}
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
       boolean res =  isPal(str);
       if(res)
       {
           System.out.println("HooooreHH!!! It's a Palindrome String");
       }
       else{
           System.out.println("Better luck next time!");
       }
    }
}
