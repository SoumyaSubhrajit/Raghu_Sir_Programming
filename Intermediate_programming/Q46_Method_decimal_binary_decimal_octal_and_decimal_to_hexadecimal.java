import java.util.Scanner;

public class Q46_Method_decimal_binary_decimal_octal_and_decimal_to_hexadecimal {
    static String isDecBinary(int n) {
        String bin = "";
        while (n != 0) {
            int rem = n % 2;
            bin = rem + bin;
            n = n / 2;
        }
        return bin;
    }

    static String isOcatal(int n) {
        String bin = "";
        while (n != 0) {
            int rem = n % 8;
            bin = rem + bin;
            n = n / 8;
        }
        return bin;
    }
    static String isHexadecimal(int n) {
        String hex = "";
        do {
            int b = n % 16;
            if (b < 10) {
                hex = b + hex;
            } else
            {
                hex = (char) (b + 55) + hex;
                n = n / 16;
            }
        }while (n != 0);

        return hex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        String num1 = isDecBinary(x);
        String num2 =isOcatal(x);
        String num3 = isHexadecimal(x);
        System.out.println("Binary number is: "+num1);
        System.out.println("Octal number is: "+num2);
        System.out.println("HexaDecimal number is: "+num3);
    }
}
