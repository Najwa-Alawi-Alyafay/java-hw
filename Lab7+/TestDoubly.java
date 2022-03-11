import java.util.List;
import java.util.Scanner;

/**
 * Created by TOSHIBA on 27/02/22.
 */
public class TestDoubly {
    public static void main(String[] args) {


    DoublyLinkedList<String>list=new DoublyLinkedList<>();
    Scanner in =new Scanner(System.in);
        System.out.println("1 add first\t 2 add last \t 3 remove first\t4remove last \t 0 exit");
       int choice=-1;
        while (choice!=0)
        {
            System.out.println("your choice");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input a name");
                    list.AddFrist(in.next());
                    break;
                case 2:
                    System.out.println("input a name");
                    list.AddLast(in.next());
                    break;
                case 3:
                    System.out.println("remove is "+list.removeFirst());
                    break;
                case 4:
                    System.out.println("remove is "+list.removeLastr());
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
            System.out.println("first  "+list.first()+"\tlast = "+list.last()+"\t size = "+list.size());
        }
}}
