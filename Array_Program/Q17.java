import java.util.Scanner;

public class Q17 {
    public  int[] toRead() {
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
    public int setEven(int[] arr)
    {
        int count=0;
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i]<1000 && arr[i]<100) {
                if (arr[i] % 2 == 0) {
                } else {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Q17 q = new Q17();
        int[] arr = q.toRead();
        int odd = q.setEven(arr);
        System.out.println("The number of odd numbers are:-"+odd);
    }
}
