import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int CapCount = 0;
        int SmaCount = 0;
        int SPCount=0;
        for(int i=0; i< str.length();i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {
                CapCount++;
            }
            else if (ch >= 'a' && ch <= 'z')
            {
                SmaCount++;
            }
            else {
                SPCount++;
            }
        }
        System.out.println("Capital Letters count: "+CapCount);
        System.out.println("Small Letters count: "+SmaCount);
        System.out.println("Special characters  count: "+SPCount);
    }
}
