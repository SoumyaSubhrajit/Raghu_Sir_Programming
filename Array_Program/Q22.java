import java.util.Scanner;

public class Q22 {
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
    public int[] setMerge(int[] a , int[] b)
    {
        int c[] = new int[a.length+b.length];
        for(int i=0;i<a.length; i++)
        {
            c[i] = a[i];
        }
        for(int i=0; i<b.length; i++)
        {
            c[i+ a.length] = b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        Q22 q = new Q22();
        int[] a = q.toRead();
        int[] b = q.toRead();
        int [] res = q.setMerge(a,b);
        q.toDisplay(res);
    }

}
