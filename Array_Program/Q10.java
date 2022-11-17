import java.util.Scanner;

// input: [78 , 56 , 3, 7 , 11 , 46 , 88 , 45 , 454 , 112 , 111]
//output: the number of prime numbers within 100 are- 3
public class Q10 {
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
            if(arr[i]<100) {
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
        Q10 q =  new Q10();
        int[] arr = q.toRead();
        int prime = q.getPrime(arr);
        System.out.println("The number of prime number are- "+prime);
    }

}
