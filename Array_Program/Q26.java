import java.util.Scanner;

public class Q26 {
    public static int[] isZigzag(int[] a ,int[] b)
    {
        int c[] = new int[a.length+b.length];
        int i=0; int j=0;
        while(i<a.length && i<b.length)
        {
            c[j++] = a[i];
            c[j++] = b[i++];
        }
        while(i<a.length)
        {
            c[j++] = a[i++];
        }
        while(i<b.length)
        {
            c[j++] = b[i++];
        }
        return c;

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
    public static void toDisplay(int[] arr)
    {
        for(int i = 0;i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] a =toRead();
        int[] b = toRead();
        int[] res = isZigzag(a,b);
        toDisplay(res);
    }
}
