import java.util.Scanner;

/**
 * Created by TOSHIBA on 15/01/22.
 */
public class MethodArray {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        int Ar[] = new int[5];
        inputAr(Ar);
        printAr(Ar);
    }
    public static void inputAr(int[]x)
    {
        System.out.println("enter num   ");
        for (int i = 0; i <x.length ; i++) {
            x[i]=in.nextInt();
        }
    }
    public  static void printAr(int []y)
    {
        for (int i = 0; i <y.length ; i++) {
            System.out.print(y[i]+"\t");
        }
    }

}
