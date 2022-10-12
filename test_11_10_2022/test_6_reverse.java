import java.util.Scanner;
public class test_6_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pro = 0;
        while(n!= 0)
        {
            int rem = n % 10;
            pro = pro * 10+rem;
            n = n/10;
        }
        System.out.println(pro);
    }
}
