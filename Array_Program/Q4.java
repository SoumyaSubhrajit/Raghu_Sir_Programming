import java.util.Scanner;

// Write a java program to define a method to return biggest element from the array..
// logic: in user entered elements you have to return biggest element in array..
// input: [34 , 67, 43,12,56,99]
public class Q4 {
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
    public int getBiggest(int[] arr)
    {
        int big = arr[0];
        for(int i=1; i< arr.length; i++)
        {
            if(arr[i]>big)
            {
                big=arr[i];
            }
        }
        return big;
    }

    public static void main(String[] args) {
        Q4 q = new Q4();
        int arr[] = q.toRead();
        int big = q.getBiggest(arr);
        System.out.println("The biggest e");
    }
}
