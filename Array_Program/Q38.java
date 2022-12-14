import java.util.Scanner;

public class Q38 {
    public static  void isPrint(int[] arr)
    {
        int even[] = new int[arr.length];
        int odd[] = new int[arr.length];
        int j=0; int k=0;
        for(int i=0;i< arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
                odd[j++] = arr[i];
            }
            else {
                even[k++]=arr[i];
            }
        }
        toDisplay(even);
        toDisplay(odd);
    }
    public  static int[] toRead() {
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
    public static void toDisplay(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a= toRead();
        isPrint(a);
    }
}
