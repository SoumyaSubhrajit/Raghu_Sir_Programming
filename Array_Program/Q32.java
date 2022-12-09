import java.util.Scanner;

public class Q32 {
    public static int[] isSort(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j]<arr[i]){
                    int temp= arr[j];
                    arr[j] = arr[i];
                    arr[i] =temp;
                }
            }
        }
        return arr;
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
    }

    public static void main(String[] args) {
        int[] a = toRead();
        int[] res = isSort(a);
        toDisplay(res);
    }
}
