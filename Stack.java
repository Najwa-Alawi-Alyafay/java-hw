/**
 * Created by TOSHIBA on 23/01/22.
 */
public interface Stack<E>
{//إعلان عن الدوال
    boolean isEmpty();
    int size();
    E top();
    void push(E element);
    E pop();

}
