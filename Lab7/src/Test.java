import java.util.Scanner;

/**
 * Created by TOSHIBA on 20/02/22.
 */
public class Test {
    public static void main(String[] args) {
        CirularlyLinkedList<String>list=new CirularlyLinkedList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("1 add first \t 2 add  last \t3 remove  first \t 4 rotate \t 0 extit");
        int choice=-1;
        while (choice!=0) {
            System.out.println("your choice ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("your choice: ");
                    list.addfirst(in.next());
                    break;
                case 2:
                    System.out.println("input name  ");
                    list.addfirst(in.next());
                    break;
                case 3:
                    list.Removefirst();
                    break;
                case 4:
                    list.rotate();
                    break;
                case 0:
                    system.exit(0);
            }
            System.out.println("first = " + list.first() + "\tlast = " + list.size());
        }}}**********************************

        }
    }
}
