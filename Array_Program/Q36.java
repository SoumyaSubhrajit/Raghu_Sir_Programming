import java.util.Scanner;

public class Q36 {
    public static int[] isEvenAndOdd(int[] arr)
    {
        int c[] = new int[arr.length];  // pending
        int ev=1; int od=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                c[ev++] = arr[i];
                ev++;
            }
            else{
                c[od++] =arr[i];
                ev++;

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
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = toRead();
        int[] res =isEvenAndOdd(a);
        toDisplay(res);
    }
}
