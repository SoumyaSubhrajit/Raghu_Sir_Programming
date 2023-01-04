import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        int SMVCount = 0;
        int CapConsoCount = 0;
        int SpCount = 0;
        for(int i=0 ; i< str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    SMVCount++;
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                } else {
                    CapConsoCount++;
                }
            } else {
                SpCount++;
            }
        }
        System.out.println("Small vowels are: "+" "+SMVCount);
        System.out.println("Capital Consonant are: "+" "+CapConsoCount);
        System.out.println("Special char are: "+" "+SpCount);
    }
}
