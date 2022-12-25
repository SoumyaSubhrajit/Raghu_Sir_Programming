import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int VCount=0;
        int CONSOCount=0;
        for(int i=0; i< str.length(); i++)
        {
            char ch= str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                {
                    VCount++;
                }
                else {
                    CONSOCount++;
            }
            }
        }
        System.out.println("captial vowels are: "+VCount);
        System.out.println("captial Consonents are: "+CONSOCount);
    }
}
