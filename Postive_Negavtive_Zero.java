import java.util.Scanner;

public class Postive_Negavtive_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        if(x > 0){
            System.out.println(x+" "+"is a postive number");
        }
        if(x<0){
            System.out.println(x+" "+"is a negative number");
        }
        if(x == 0){
            System.out.println(x+" "+"is a zero number");
        }
    }
}
