import java.util.Scanner;

public class Q27 {
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

    public static int[] isShort(int a[] , int[] b)
    {
        int c[] = new int[a.length+b.length];
        int i =0 ; int j=0 ; int k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                c[k++] = a[i++];
            }
            else{
                c[k++] = b[j++];
            }
        }
       while(i<a.length)
       {
           c[k++] = a[i++];
       }
        while(j<b.length)
        {
            c[k++] = b[j++];
        }
        return c;
    }

    public static void main(String[] args) {
        int [] a = toRead();
        int[] b = toRead();
        int[] res = isShort(a,b);
        toDisplay(res);
    }

}
