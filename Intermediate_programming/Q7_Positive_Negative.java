import java.util.Scanner;

public class Q7_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if(x>0) {
            System.out.println("Positive");
        }
            else if(x<0) {
            System.out.println("Negative");
        }
                else if(x==0){
                    System.out.println("Zero");
                }
            }
        }