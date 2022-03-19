/**
 * Created by TOSHIBA on 19/03/22.
 */
public class Test {
        public static void main(String[] args) {
            DoublyLinkedList<Integer>input=new DoublyLinkedList<Integer>();

            input.addFrist(200);
            input.addFrist(200);

            DoublyLinkedList<Integer>in=new DoublyLinkedList<Integer>();
            in.addFrist(200);
            in.addFrist(400);

            DoublyLinkedList<Integer>x=new DoublyLinkedList<Integer>();
            input.addFrist(52);
            DoublyLinkedList<String>blankList1=new DoublyLinkedList<String>();

            DoublyLinkedList<String>blankList2=new DoublyLinkedList<String>();
            if(blankList1.equals(blankList2)){
                System.out.println(blankList1+"="+blankList2);
            }
            if(!input.equals(x)){
                System.out.println(input+" !="+x);
            }
            if (input.equals(in)){
                System.out.println(input+" ="+in);
            }}}
