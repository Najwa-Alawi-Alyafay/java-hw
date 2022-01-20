import java.util.Arrays;

/**
 * Created by TOSHIBA on 16/01/22.
 */
public class ArrayOperation {
    public static void main(String[] args) {
        int[] a = {11, 12, 131, 14, 15};
        System.out.println(Arrays.toString(a));
        int[] after=reverse(a);
        System.out.println(Arrays.toString(after));
    }
    public  static int[] reverse(int[]x)
    {
        int n=x.length-1;
        for (int i = 0; i <x.length/2 ; i++) {
            int t = x[i];
            x[i] = x[n];
            x[n] = t;
            n--;
        }
        return x;
    }
public static void print(int[]x){
    System.out.println("[");
    for (int i = 0; i <x.length ; i++) {
        System.out.println(x[i]);
        if(i<x.length)
            System.out.println(",");
    }
    System.out.println("]");
}
}

