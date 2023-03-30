import java.util.Scanner;

public class Q16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int CpVCount = 0;
        int SmConsoCount = 0;
        int SpCount = 0;
        for(int i=0; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                CpVCount++;
            }
            else if(ch>='a' && ch<='z')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {

                }
                else{
                    SmConsoCount++;
                }
            }
            else{
                SpCount++;
            }
        }
        System.out.println("Capital vowels are ->"+" "+ CpVCount);
        System.out.println("Small Consonents are ->"+" "+ SmConsoCount);
        System.out.println("Special Characters are ->"+" "+ SpCount);
        }
    }



