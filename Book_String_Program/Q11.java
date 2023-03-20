import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int VCount = 0;
        int SmallCONSOCount = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z')
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                }
                else{
                    SmallCONSOCount++;
                }
            }
            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    VCount++;
                }
            }
        }
        System.out.println("Captital Vowel is: " + VCount);
        System.out.println("Small Consonants is: " +SmallCONSOCount);
    }
}
