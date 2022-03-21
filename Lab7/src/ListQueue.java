/**
 * Created by TOSHIBA on 20/02/22.
 */
public interface ListQueue<E> {
    /**
     * Created by TOSHIBA on 30/01/22.
     */
        boolean isEmpty();
        int size();
        void enqueue(E element);
        E dequeue();
        E first();

    }


*****************************