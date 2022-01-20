import java.util.Scanner;

    /**
     * Created by TOSHIBA on 15/01/22.
     */
    public class InputArray {
        public static void main(String[] args) {
            int arry[]=new int [5];
            Scanner in=new  Scanner(System.in);
            System.out.println("enter array");
            for (int i = 0; i <arry.length ; i++) {
                arry[i] = in.nextInt();
            //input
            }
            for (int i = 0; i <arry.length ; i++) {
                System.out.print(" "+arry[i]);

//output
            }
        }
    }


