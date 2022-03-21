/**
 * Created by TOSHIBA on 21/03/22.
 */
public class Q2 {/**
 * Created by server on 3/20/2022.
 */

    static class Node
    {   char data;
        Node prev;
        Node next;   }
    static Node head = null;
    static void rotate( int N)
    { if (N == 0)    return;
        Node current = head;   int count = 1;
        while (count < N && current != null)
        {   current = current.next;    count++;}
        if (current == null)   return;
        Node NthNode = current;
        while (current.next != null)
            current = current.next;  current.next = head;
        (head).prev = current;  head = NthNode.next;
        (head).prev = null;   NthNode.next = null;      }
    static void push(char new_data)
    {         Node new_node = new Node();
        new_node.data = new_data;
        new_node.prev = null;new_node.next = (head);
        if ((head) != null)
            (head).prev = new_node;  head = new_node;         }
    static void printList(Node node)
    {       while (node != null && node.next != null)
    {       System.out.print(node.data + " ");     node = node.next;     }
        if(node != null)      System.out.print(node.data);        }
    public static void main(String[] args)
    {    push( 'e');
        push( 'd');
        push('c');
        push('b');
        push( 'a');
        int N = 2;
        System.out.println("Given linked list ");
        printList(head);   rotate( N);          System.out.println();
        System.out.println("Rotated Linked list ");   printList(head);     }}





