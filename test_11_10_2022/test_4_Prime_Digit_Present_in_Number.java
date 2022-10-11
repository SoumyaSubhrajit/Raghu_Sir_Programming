import java.util.Scanner;
public class test_4_Prime_Digit_Present_in_Number {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 1;
            while (n != 0) {
                int fac = 0;
                int rem = n % 10;
                for (int i = 1; i <= rem; i++) {
                    if (rem % i == 0) {
                        fac++;
                    }
                }

                if (fac == 2) {
                    count++;
                }
                n = n / 10;
            }
            System.out.println(count);
        }
    }
}
