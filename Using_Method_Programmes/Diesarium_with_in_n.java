import java.util.Scanner;

public class Diesarium_with_in_n {
  static int isCount(int n)
  {
      int count = 0;
      while( n!= 0){
          int rem = n % 10;
          count++;
          n = n /10;
      }
      return count;
  }
  static int pw(int n , int p){
      int pw= 1;
      while(p>0)
      {
          pw= pw * n;
          p--;
      }
      return  pw;
  }
  static boolean isDiesarium(int n){
      int temp = n;
      int sum = 0;
      int p = isCount(n);
      while( n!=0){
          int rem = n % 10;
          sum = sum + pw(rem,p);
          n= n/10;
          p--;
      }
      return sum == temp;
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number range");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++)
        {
            boolean num = isDiesarium(i);
            if(num){
                System.out.println(i);
            }
        }
    }
}
