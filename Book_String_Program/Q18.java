import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int CapVCount = 0;
        int CapConsoCount = 0;
        int SpCount = 0;
        for(int i=0; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    CapVCount++;
                }
                else
                {
                    CapConsoCount++;
                }
            }
            else if(ch >= 'a' && ch <= 'z')
            {

            }
            else{
                SpCount++;
            }

        }
        System.out.println("Captial vowels are: "+CapVCount);
        System.out.println("Captial Consonant are: "+CapConsoCount);
        System.out.println("Special char are: "+SpCount);
    }
}
