import java.util.Scanner;

public class Q35 {
    public static void isBigandSmall(int[] arr)
    {
        int big=0;int small=0;
        for(int i=0;i<arr.length; i++)
        {
             big=arr[i];
            for(int j=i+1; j<arr.length; j++)
            {
                if(big<arr[j])
                {
                    big = arr[j];
                }
                else{
                    small = arr[j];
                }
            }
        }
        System.out.println("big is: "+big);
        System.out.println("small is: "+small);
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
        int[] a= toRead();
        isBigandSmall(a);
    }
}
