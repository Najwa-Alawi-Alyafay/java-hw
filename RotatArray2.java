import java.util.Arrays;

/**
 * Created by TOSHIBA on 16/01/22.
 */
public class RotatArray2 {
    public static void main(String[] args) {
        int a[] = {11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(a));

        System.out.println("right");
        System.out.println(Arrays.toString(ShiftRight(a)));
}
    public static int[]ShiftRight(int[]y) {
        int t = y[y.length - 1];
        for (int i = y.length - 1; i > 0; i--) {
            y[i] = y[i - 1];
        } y[0]=t;
        return  y;
}}
