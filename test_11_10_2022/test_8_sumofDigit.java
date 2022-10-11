import java.util.Scanner;
public class test_8_sumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        while(x != 0)
        {
            int rem = x % 10;
            sum = sum + rem;
            x = x / 10;
        }
        System.out.println(sum);
    }
}
