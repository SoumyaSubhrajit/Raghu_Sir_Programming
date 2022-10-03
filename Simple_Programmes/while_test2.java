public class while_test2 {
    public static void main(String[] args) {
        int i = 1; int j = 1;
        while (i++<=100){
            while(j++<=200){
                if(j==150)
                    break ;
                else
                    System.out.println(i+" "+j);
            }
        }
    }
}
