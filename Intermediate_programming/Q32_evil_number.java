import java.util.Scanner;

public class Q32_evil_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        String bin = "";
        int count = 0;
        while (n!=0)
        {
            int rem = n %2;
            if(rem == 1){
                count++;
            }
            bin = rem+bin;
            n = n / 2;
        }
        if(count % 2 == 0){
            System.out.println("evil number");
        }
        else {
            System.out.println("odius number");
        }



    }
}
