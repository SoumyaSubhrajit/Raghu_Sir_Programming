import java.util.Scanner;

public class Q8 {
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
            if (arr[i]%2==0)
            {
            }
            else{
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Q8 q = new Q8();
        int[] arr = q.toRead();
        int odd = q.setEven(arr);
        System.out.println("The number of odd numbers are:-"+odd);
    }
}
