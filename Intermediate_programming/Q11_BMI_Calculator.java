import java.util.Scanner;

public class Q11_BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight");
        int a = sc.nextInt();
        System.out.println("Enter your height");
        float b = sc.nextFloat();
        float BMI = a / (b*b);
        System.out.println("BMI of person is: "+" "+BMI);
    }
}
