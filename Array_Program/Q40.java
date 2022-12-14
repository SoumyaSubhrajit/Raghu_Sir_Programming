import java.util.Scanner;

public class Q40 {
    public static void isCount(int[] arr)
    {
        int evcount =0;
        int oddcount= 0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evcount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("even present in array is: "+evcount);
        System.out.println("odd present in array is: "+oddcount);
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

    public static void main(String[] args) {
        int[] a = toRead();
        isCount(a);
    }

}
