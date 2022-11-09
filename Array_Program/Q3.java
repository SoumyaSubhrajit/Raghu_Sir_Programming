// input: [34 , 56 , 78 , 12 , 45, 67]
// output: The smallest element is: 12

import java.util.Scanner;

public class Q3 {
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
    public int getSmall(int[] arr)
    {
        int small = arr[0];
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i]<small)
            {
                small = arr[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        Q3 q = new Q3();
        int [] arr = q.toRead();
        int samll = q.getSmall(arr);
        System.out.println("The samllest element in this array is: "+samll);
    }
}
