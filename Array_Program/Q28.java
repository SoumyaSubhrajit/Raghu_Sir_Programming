import java.util.Scanner;

public class Q28 {
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
    public static void isCommon(int[] arr1 , int[] arr2)
    {
         int count=0;
        for(int i=0; i< arr1.length;i++)
        {
            int temp = arr1[i];
            for(int j=0;j< arr2.length; j++)
            {
                if(arr2[j]==temp)
                {
                    System.out.println("the common element is: "+temp);
                    break;
                }
            }
        }
    }
    public static void toDisplay(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = toRead();
        int[] b = toRead();
        isCommon(a,b);

    }
}
