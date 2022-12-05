import java.util.Scanner;

public class Q31{
    public  static int[] toRead() {         // [ 7 , 1 ,2 , 5] user enter =5 --op= 3
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
    public static void isIndex(int[]  arr ,int n)
    {
        for(int i=0; i< arr.length;i++)
        {
            if(arr[i]==n)
            {
                System.out.println(i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = toRead();
        System.out.println("Enter tha value you want to check");
        int n = sc.nextInt();
        isIndex(arr,n);

    }
}
