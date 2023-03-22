import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int SmCount = 0;
        int SPCount=0;
        for(int i=0; i< str.length();i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {

            }
            else if (ch >= 'a' && ch <= 'z')
            {
                    SmCount++;
            }
            else {
                SPCount++;
            }
        }
        System.out.println("Letters count: "+SmCount);
        System.out.println("Special characters  count: "+SPCount);
    }
}
