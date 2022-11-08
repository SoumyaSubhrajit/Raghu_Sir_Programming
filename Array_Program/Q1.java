import java.util.Scanner;

// input: [ 78.05% , 65.87% , 45.67% , 76.43% , 98.08% ]
// output: the highest percentage is - 98.08%
public class Q1 {
    public double getHighest(double[] arr)
    {
        double isHigh = arr[0];
        for(int i=1; i< arr.length; i++)
        {
            if(isHigh< arr[i])
            {
                isHigh = arr[i];
            }
        }
        return isHigh;
    }
    public double[] toRead()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        System.out.println("Enter the percentage: ");
        double arr[] = new double[n];
        for(int i =0; i< arr.length; i++)
        {
            arr[i] = sc.nextDouble();
        }
        return arr;
    }
    public static void main(String[] args) {
        Q1 q = new Q1();
        double arr[] = q.toRead();
        double ishigh = q.getHighest(arr);
        System.out.println("The highest percentage is: "+" "+ishigh+"%");
    }
}
