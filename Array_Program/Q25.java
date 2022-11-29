import java.util.Scanner;

public class Q25 {
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
    public void toDisplay(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public int[] setMerge(int[] a , int[] b, int in1)
    {
        int i=0;
        int j=0; int k=0;
        int c[] = new int[a.length+b.length];
       while(i<a.length-in1)
       {
           c[k++] = a[i++];
       }
        while (j < b.length)
        {
            c[k++] = b[j++];
        }
        while(i<a.length)
        {
            c[k++] = a[i++];
        }

        return c;
    }

    public static void main(String[] args) {
        Q25 q = new Q25();
        int[] a = q.toRead();
        int[] b = q.toRead();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Array specified index");
        int x = sc.nextInt();
        int [] res = q.setMerge(a,b,x);
        q.toDisplay(res);
    }
}
