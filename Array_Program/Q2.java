import java.util.Scanner;

// input: [ 40 , 60 , 20 , 40 , 40]
// output: The sum of all element is: 200
public class Q2 {
    public int[] toRead() {
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
    public int getSum(int[] arr)
    {
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Q2 q = new Q2();
        int arr[] = q.toRead();
        int sum =   q.getSum(arr);
        System.out.println("The sum of all the element is: "+sum);
    }
}
