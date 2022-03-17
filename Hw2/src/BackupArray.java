/**
 * Created by TOSHIBA on 17/03/22.
 */
import java.util.Arrays;
public class BackupArray {
    //Q2
        public static void main(String[] args) {
            System.out.println( "Copy Array ="+Arrays.toString(copy())+"      *_*");
        }
        public static int[] copy() {
            int[] f = {1,2,3,4,5};
            int[] c = new int[f.length];
            c = f;
            return c;

    }
}
