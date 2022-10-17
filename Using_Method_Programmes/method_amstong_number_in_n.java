import java.util.Scanner;

public class method_amstong_number_in_n {
    static int isCount(int n) {
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

    static int pow(int n, int p) {
        int pw = 1;
        while (p > 0) {
            pw = pw * n;
            p--;
        }
        return pw;
    }

    static boolean isAmstrong(int n) {
        int temp = n;
        int p = isCount(n);
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + pow(rem, p);
            n = n / 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            boolean num = isAmstrong(i);
            if (num) {
                System.out.println(i);
            }
        }
    }
}