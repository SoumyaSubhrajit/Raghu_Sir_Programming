import java.util.Scanner;

public class Q20 {
    public int[] toRead() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the" + " " + n + " integer value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int setPalindrome(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 100 && arr[i]<1000)
            {

                int rev = 0;
                int temp = arr[i];
                while (arr[i] != 0) {
                    int rem = arr[i] % 10;
                    rev = rev * 10 + rem;
                    arr[i] = arr[i] / 10;
                }
                if (rev == temp)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Q20 q = new Q20();
        int[] arr = q.toRead();
        int res = q.setPalindrome(arr);
        System.out.println("The number of palindrome number are:- " + res);
    }
}
