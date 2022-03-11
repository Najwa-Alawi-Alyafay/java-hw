/**
 * Created by TOSHIBA on 30/01/22.
 */
public class ArreyQueue<E>implements Queue<E>  {
    E[]data;
    int f=0;
    int sz=0;
    static final int CAPACITY=100;

    public ArreyQueue(int c) {
        data=(E[])new Object[c];
    }

    public ArreyQueue() {
        this(CAPACITY);
    }




    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enqueue(E element) {
if(size()==data.length)
    throw new IllegalStateException("Queue  is full *_*");
        int index=(f+sz)% data.length;
        data[index]=element;
        sz++;

    }

    @Override
    public E dequeue() {
        if(isEmpty())return null;
        E deleted=data[f];
        f=(f+1)%data.length;
        sz--;
        return deleted;

    }

    @Override
    public E first() {
        if(isEmpty())
        return null;
        return data[f];

    }
}
