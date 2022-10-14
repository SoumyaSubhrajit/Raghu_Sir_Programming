import java.util.Scanner;

public class Q28_Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
       int l  = (""+n).length();
       int sq = n * n;
       int end = sq%(int)Math.pow(10,l);
       if( n== end){
           System.out.println("Automorphic Number");
       }
       else{
           System.out.println("Not a Automorphic Number");
       }
    }
}
