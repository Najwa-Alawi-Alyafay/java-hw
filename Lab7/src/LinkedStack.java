/**
 * Created by TOSHIBA on 20/02/22.
 */
public class LinkedStack<E> implements Stack<E>{
        SinglyLinkedList<E>l=new SinglyLinkedList<E>();

    @Override
    public int size() {
        return l.isEmpty();
    }

    @Override
    public E top() {
        return l.first();
    }

    @Override
    public void push(E element) {
        l.addfirst(element);

    }

    @Override
    public E pop() {
        return l.RemoveFirst();
    }
}

*************************************