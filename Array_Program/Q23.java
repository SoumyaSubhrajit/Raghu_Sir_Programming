import java.util.Scanner;

public class Q23 {
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
    public static int[] toIndex(int[] a,int num, int index)
    {
        int c[] = new int[a.length+1];
         c[index] = num;

        for(int i=0; i<a.length;i++)
        {
            if(i<index){
                c[i] = a[i];
            }
            else {
                c[i+1] = a[i];
            }
        }
        return c;
    }

    public static void main(String[] args) {

        int[] a = toRead();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number that you want to change");
        int num = sc.nextInt();
        System.out.println("Enter the index");
        int in = sc.nextInt();
        int[] res = toIndex(a,num,in);
        toDisplay(res);
    }
}
