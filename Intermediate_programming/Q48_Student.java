import java.util.Scanner;

public class Q48_Student {
    String fname;
    String lname;
    int id;
    String Bdate;
    Q48_Student(){
       /*this.(100);*/

    }
    Q48_Student(int i){
        this.id = i;
    }
    Q48_Student(String fname , String lname , String Bdate){
          this.fname = fname;
          this.lname = lname;
          this.Bdate = Bdate;

    }
    public static void main(String[] args) {
        Q48_Student s1 = new Q48_Student("kanha" , "bag","16/05/2000");
        Q48_Student s2 = new Q48_Student("souraj" , "miranl","23/11/2001");
        Q48_Student s3 = new Q48_Student("Alok" , "Rana","11/07/1999");
        Q48_Student s4 = new Q48_Student("Samundar" , "sigh","07/10/1998");
        Q48_Student s5 = new Q48_Student("Soumya" , "Bagh","02/14/1997");
       Q48_Student[] arr ={s1 , s2 ,s3 ,s4 ,s5};
       for (int i = 0; i< arr.length;i++)
       {
           System.out.println(i);
         System.out.println(arr[i].fname);
           System.out.println(arr[i].lname);
           System.out.println(arr[i].Bdate);
       }
    }
}
