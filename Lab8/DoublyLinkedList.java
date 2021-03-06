import java.util.concurrent.RecursiveTask;

/**
 * Created by TOSHIBA on 27/02/22.
 */
public class DoublyLinkedList<E> {
    private Node<E>header;
    private  Node<E>trailer;
    private int size=0;
    public  DoublyLinkedList(){
        header=new Node<E>(null,null,null);
        //               ELEMENT,PREV,NEXT
        trailer=new Node<E>(null,header,null);
        header.setNext(trailer);
    }
    public boolean isEmpty(){
       return size==0;
    }
    public int size(){
        return size;
    }
    public  E first(){
        if(isEmpty())return null;
        return header.getNext().getElement();

    }
    public  E last(){
        if(isEmpty()) return  null;
        return trailer.getPrev().getElement();
    }

private void AddBetween(E el,Node<E>p,Node<E>n){
   Node<E>newest=new Node<E>(el,p,n);
    p.setNext(newest);
    n.setPrev(newest);
    size++;
}
    public void  AddFrist(E el){
        AddBetween(el,header,header.getNext());
    }
public void  AddLast(E el){
    AddBetween(el,trailer.getPrev(),trailer);
}
private  E remove(Node<E>x){
    Node<E> p=x.getPrev();
    Node<E>n=x.getNext();
    p.setNext(n);
    n.setPrev(p);
    size--;
    return x.getElement();

}
public E removeFirst(){
    if(isEmpty())return null;
    return remove(header.getNext());

}
public  E removeLastr()
{
    if(isEmpty())return null;
    return remove(trailer.getPrev());
}































        private static  class Node<E>
        {
            E element ;
            Node<E> prev;
            Node<E>next;

            public Node(E element, Node<E> prev, Node<E> next) {
                this.element = element;
                this.prev = prev;
                this.next = next;
            }

            public E getElement() {
                return element;
            }

            public void setElement(E element) {
                this.element = element;
            }

            public Node<E> getPrev() {
                return prev;
            }

            public void setPrev(Node<E> prev) {
                this.prev = prev;
            }

            public Node<E> getNext() {
                return next;
            }

            public void setNext(Node<E> next) {
                this.next = next;
            }}}







#include <iostream>
using namespace std;



        struct List
        {
        int data;
        struct List *next;
        struct List *prev;
        };

        void push(struct List** head, int data)
        {
        struct List* node = new List;
        node->data  = data;
        node->next = (*head);
        node->prev = NULL;
        if ((*head) !=  NULL)
        (*head)->prev = node ;
        (*head)    = node;
        }

//Answer to the question
        int Size(struct List *node)
        {
        int res = 0;
        while (node != NULL)
        {
        res++;
        node = node->next;
        }
        return res;
        }



        int main()
        {
        struct List* node = NULL;
        push(&node, 4);
        push(&node, 3);
        push(&node, 2);
        push(&node, 1);
        cout << Size(node);
        return 0;
        }