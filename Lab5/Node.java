/**
 * Created by TOSHIBA on 19/02/22.
 */
class Node<E>{
         E element;
     Node<E>next;

    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;

    }
    public E getElement() {
        return element;
    }
    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
//***************************************************************************
 class SinglyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    int size = 0;

    public SinglyLinkedList() {

    }
//*****************************************************************************
    public boolean isEmpty() {
        return size == 0;
    }
//*************************************************************

    public int size() {
        return size;
    }
//*******************************************************
    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }
//******************************************************
    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }
    //*******************************************************************
public void addfirst(E element){
head=new Node<E>(element,head);
if(size==0)
tail=head;
    size++;
}
//*****************************************************
public void  addLast(E element){
    Node<E> x=new Node<E>(element, null);
    if(size==0)
        head=x;
    else
        tail.setNext(x);
    size++;
}
//*********************************************************************
public E RemoveFirst()

    {
        if (isEmpty())
            return null;
        E deleted = head.getElement();
        size--;
        if (size == 0)
            tail = null;
        return deleted;
    }}