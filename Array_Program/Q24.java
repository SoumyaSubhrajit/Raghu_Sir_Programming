import java.util.Scanner;

public class Q24 {
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
    public static void toDisplay(int[] arr)
    {
        for(int i = 0;i<arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static int[] toIndex(int[] a ,int index)
    {
        int c[] = new int[a.length-1];
        for(int i=0; i<a.length-1;i++)
        {
            if(i<index){
                c[i] = a[i];
            }
            else {
                c[i] = a[i+1];
            }
        }
        return c;
    }

    public static void main(String[] args) {

        int[] a = toRead();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        int in = sc.nextInt();
        int[] res =toIndex(a,in);
        toDisplay(res);
    }
}
