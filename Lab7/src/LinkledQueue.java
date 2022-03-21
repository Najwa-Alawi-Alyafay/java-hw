import java.util.Queue;

/**
 * Created by TOSHIBA on 20/02/22.
 */
public class LinkledQueue<E>implements ListQueue<E> {
    SinglyLinkedList<E>l=new SinglyLinkedList<E>();

    @Override
    public boolean isEmpty() {
        return l.isEmpty();
    }

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public void enqueue(E element)
    {
l.addLast(element);
    }

    @Override
    public E dequeue() {
        return l.RemoveFirst();
    }

    @Override
    public E first() {
        return l.first();
    }
}
****************************************8