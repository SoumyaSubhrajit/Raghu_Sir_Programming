public class Q47_Student2 extends Q47_Student {
    @Override
    public void properties(String name, int id, String stream) {
        String name1 = name;
        int id1 = id;
        String stream1 = stream;
        System.out.println(name1 + " "+ id1 + " "+stream1);
    }

    public static void main(String[] args) {
        Q47_Student2 s2 = new Q47_Student2();
        s2.properties("kanha" , 44 , "EEE");


    }
}
