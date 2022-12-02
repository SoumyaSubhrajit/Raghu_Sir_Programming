import java.util.Scanner;

public class Q29
{
    public static void isMagic(int[] arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            int n = arr[i];
            while (n>10)
            {
                int sum = 0;
                while(n!=0)
                {
                    int rem = n %10;
                    sum = sum + rem;
                    n =n/10;
                }
                n=sum;
            }
            if(n==1)
            {
                System.out.println(arr[i]);
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
        int[] a = toRead();
        isMagic(a);
    }
}
