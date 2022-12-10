import java.util.Scanner;

public class Q36_revisit {
    public static int[] isEvenOdd(int[] arr)
    {
        int c[];
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
       c = isZigZag(odd,even);
        return c;

    }
    public static int[] isZigZag(int[] odd,int[] even)
    {
        int c[] = new int[odd.length+even.length];
        int i = 0; int j=0;
        while(i< odd.length && i<even.length)
        {
            c[j++] = odd[i];
            c[j++] = even[i++];
        }
        while (i<odd.length)
        {
            c[j++] =odd[i++];
        }
        while (i<even.length)
        {
            c[j++] =even[i++];
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
    public static void toDisplay(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0)
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = toRead();
        int[] res = isEvenOdd(a);
        toDisplay(res);
    }

}
