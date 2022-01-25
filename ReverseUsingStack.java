import java.util.Arrays;

/**
 * Created by TOSHIBA on 23/01/22.
 */
public class ReverseUsingStack {
    public static void main(String[] args) {
        int a[]={11,22,33,44,55};
        System.out.println(Arrays.toString(a));
        ArrayStack<Integer> s=new ArrayStack<>(a.length);
        for (int i = 0; i <a.length ; i++) {
            s.push(a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.pop();

        }
        System.out.println("after revers using stack ");
        System.out.println(Arrays.toString(a));
    }
}
