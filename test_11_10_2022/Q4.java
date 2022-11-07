// print the sum of smallest digit and biggest 
// digit? ex: input:23412 output:5

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = isBig(n) + isSmall(n);
        System.out.println(sum);
    }

    public static int isBig(int x) {
        int big = -9;
        while (x != 0) {
            int rem = x % 10;
            if (rem > big) {
                big = rem;
            }
            x = x / 10;
        }
        return big;
    }

    public static int isSmall(int x) {
        int small = 9;
        while (x != 0) {
            int rem = x % 10;
            if (rem < small) {
                small = rem;
            }
            x = x / 10;
        }
        return small;
    }

}