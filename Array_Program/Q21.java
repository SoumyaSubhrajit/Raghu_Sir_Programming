import java.util.Scanner;

public class Q21 {
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
    public void toDisplay(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public void setReverse(int[] arr)
    {
        int i=0;
        int j = arr.length-1;
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Q21 q = new Q21();
        int[] arr = q.toRead();
         q.setReverse(arr);
       q.toDisplay(arr);

    }
}
