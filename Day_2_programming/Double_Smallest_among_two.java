import java.util.Scanner;

public class Double_Smallest_among_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first non-decmal number");
        double x  = sc.nextDouble();
        System.out.println("Enter the second non-decmal number");
        double y  = sc.nextDouble();
        if(x > y){
            System.out.println(y+" "+" is smallest");
        }
        else{
            System.out.println(x+" "+ " is smallest");
        }
    }
}
