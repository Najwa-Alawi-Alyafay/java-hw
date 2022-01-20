import java.util.Arrays;

/**
 * Created by TOSHIBA on 16/01/22.
 */
public class RotatArray
{
    public static void main(String[] args) {
        int a[] = {11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(a));
         System.out.println("laft");
         System.out.println(Arrays.toString(shiftleft(a)));
    }
    public static int[]shiftleft(int []x){
        int t=x[0];
        for (int i = 0; i <x.length-1;i++) {
            x[i] = x[i + 1];
        }
        x[x.length-1]=t;
        return x;


}}
