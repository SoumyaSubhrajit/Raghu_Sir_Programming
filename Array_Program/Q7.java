import java.util.Scanner;

// Input: [ 23,45,44,28,67,64]
// output: The number of even numbers are= 3;
public class Q7 {
    public  int[] toRead() {
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
    public int setEven(int[] arr)
    {
        int count=0;
        for(int i=0; i< arr.length; i++)
        {
            if (arr[i]%2==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Q7 q = new Q7();
        int[] arr = q.toRead();
        int even = q.setEven(arr);
        System.out.println("The number of even number are:-"+even);
    }
}
