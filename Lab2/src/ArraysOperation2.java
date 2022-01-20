import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by TOSHIBA on 16/01/22.
 */
public class ArraysOperation2 {
    int[] x;
    int numOfElements;

    public ArraysOperation2() {
        x = new int[5];
       int numOfElements = 0;

    }

    public int addElement(int e) {
        if (numOfElements < x.length) {
            x[numOfElements] = e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArraysOperation2 test = new ArraysOperation2();
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(test.x));

        System.out.println("input elements");
        for (int i = 0; i < 7; i++) {
            // if (test.addElement(in.nextInt())==0)
            if (test.addSortedElement(in.nextInt()) == 0)

                System.out.println("added sucessfully");
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));
        }
    }

    public int addSortedElement(int e) {
        if (numOfElements < x.length) {
            int i = numOfElements;
            while (i > 0 && e < x[i - 1]) {
                x[i] = e;
                numOfElements++;
            }
            return 0;
        }
        return -1;
    }