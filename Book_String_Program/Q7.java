import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int conso = 0;
        int vow = 0;
        for(int i=0;i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<= 'Z')
            {
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                {
                    vow++;
                }
                else {
                    conso++;
                }
            }
            if(ch>='a' && ch<= 'z')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    vow++;
                }
                else {
                    conso++;
                }
            }
        }
        System.out.println("Vowel is: "+vow);
        System.out.println("Consonents: "+conso);
    }
}
