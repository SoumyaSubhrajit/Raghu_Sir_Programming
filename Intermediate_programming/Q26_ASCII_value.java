public class Q26_ASCII_value {
    public static void main(String[] args) {
        char c;
        for(c = 'A'; c<='Z';c++)
        {
            for (int i = 65;  i <  c; i++)
            {
                System.out.println(i);
            }
        }
    }
}
