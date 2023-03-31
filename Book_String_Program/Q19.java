import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int SmVowel = 0;
        int SmConsoCount = 0;
        int SpCount = 0;
        for(int i=0; i <str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {

            }
            else if(ch >= 'a' && ch <= 'z')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                     SmVowel++;
                }
                else{
                    SmConsoCount++;
                }
        }
            else{
                SpCount++;
            }
        }
        System.out.println("Small voels are: "+SmVowel);
        System.out.println("Small consonant are: "+SmConsoCount);
        System.out.println("Special Charecter are: "+SpCount);
    }
}
