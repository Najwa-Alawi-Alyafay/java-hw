/**
 * Created by TOSHIBA on 18/03/22.
 */
public class Rotate
{
    static  class LinkedList{
        Node head;
        class Node{
        int data;
        Node next;
        Node(int c){
        data=c;
        next=null;
        }
        }
    void  rotate(int l){
        if(l==0) return;
        Node current=head;
        int count=1;
        while (count<l&&current!=null){
            current=current.next;
            count++;
        }
        if(current==null) return;
        Node lthNode=current;
        while (current.next!=null)
            current=current.next;
        current.next=head;
        head=lthNode.next;
        lthNode.next=null;
    }
    void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }

        public static void main(String[] args) {
            LinkedList list=new LinkedList();
            for (int i = 30; i <90 ; i-=10) {
                list.push(i);
                System.out.println("input the list");
                list.print();list.rotate(5);
                System.out.println("the rotat for linked list");
                list.print();
            }
        }
    }
}
