import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int VCount=0;
        int CONSOCount=0;
        for(int i=0;i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<= 'z')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    VCount++;
                }
                else {
                    CONSOCount++;
                }
            }
        }
        System.out.println("Small Vowel is: "+VCount);
        System.out.println("Small Consonants is: "+CONSOCount);
    }
}
