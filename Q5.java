// input: [23, 45, 56,78]
// output: The average of all the elements is- 143.5

import java.util.Scanner;

public class Q5
{
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
    public double getAvrage(int[] arr)
    {
        double avg=0; int sum=0;
        for(int i=0; i< arr.length;i++)
        {
            sum = sum+arr[i];
        }

        return avg = (double) (sum/ arr.length);
    }

    public static void main(String[] args) {
        Q5 q = new Q5();
        int [] arr = q.toRead();
        double big = q.getAvrage(arr);
        System.out.println("The average is: "+big);
    }

}
