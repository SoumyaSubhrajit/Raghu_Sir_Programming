import java.util.Scanner;

public class Q19 {
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
    public int getPrime(int[] arr)
    {
        int count=0;
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i]<1000 && arr[i]<100) {
                int fac = 0;
                for (int j = 2; j * j <= arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        fac++;
                    }
                }

                if (fac == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Q19 q =  new Q19();
        int[] arr = q.toRead();
        int prime = q.getPrime(arr);
        System.out.println("The number of prime number are- "+prime);
    }
}
