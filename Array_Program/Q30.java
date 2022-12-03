import java.util.Scanner;

public class Q30 {
    public static  void isFre(int[] arr)
    {
        boolean fr[] = new boolean[arr.length];
        for(int i=0; i< arr.length; i++)
        {
            if(fr[i]==false)
            {
                int count=1;
                for(int j=i+1; j< arr.length;j++)
                {
                    if(arr[j]==arr[i])
                    {
                        count++;
                        fr[j] = true;
                    }
                }
                System.out.println(arr[i]+"->"+count);
            }

        }

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
        int a[] = toRead();
        isFre(a);
    }
}
