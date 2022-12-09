import java.util.Scanner;

public class Q34 {
    public  static  int[] isDuplicate(int[] arr)
    {
        int c[]= new int[arr.length];  //EXCEPTION;
        boolean bol[] = new boolean[arr.length];
        for(int i=0; i< arr.length;i++)
        {
            if(bol[i]==false)
            {
                for(int j =i+1; j< arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                       c[i]=arr[j];
                       bol[j]=true;
                    }
                }
            }
            if (bol[i]==false)
            {
                c[i]=arr[i];
            }
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
        int res[] = isDuplicate(a);
        toDisplay(res);
    }
}
