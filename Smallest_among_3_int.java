import java.util.Scanner;

public class Smallest_among_3_int {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter first number");
  int x = sc.nextInt();
  System.out.println("Enter Second number");
  int y = sc.nextInt();
  System.out.println("Enter Third number");
  int z = sc.nextInt();
  int small = x;
  if(small  > y){
   small =y;
  }
  if(small> z){
   small = z;
  }
  System.out.println("The samllest among 3 decimal number is"+" "+small);
 }
}