public class Q47_Student {
   public class Student {
       private int id;
       private String stream;
       private String name;
       public Student(int id, String stream , String name)
       {
           this.id = id;
           this.stream = stream;
           this.name = name;
       }
       public String toString(){
           return "{ "+id+" , "+stream+" , "+name+"}";
       }
   }
}
