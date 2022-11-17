import java.util.Scanner;

// Input: [12,34,45,77,99,89,66,45,989,787]
// Output: The number of palindrome number within 100 are- 4.
public class Q13 {
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
            if (arr[i] < 100)
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
        Q13 q = new Q13();
        int[] arr = q.toRead();
        int res = q.setPalindrome(arr);
        System.out.println("The number of palindrome number are:- " + res);
    }
}