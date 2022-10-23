public class Q53_for_loop_and_for_each_loop {
    public static void main(String[] args) {
        int[] arr = {2,5,4,8,3,7,2};
        System.out.println("using for loop");
        for (int i = 0; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Using for each loop");
        for (int x:arr)
        {
           System.out.println(x);
        }
    }
}
