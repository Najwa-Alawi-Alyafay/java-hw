
import java.util.Scanner;

/**
 * Created by TOSHIBA on 30/01/22.
 */
public class TestQueue {
    public static void main(String[] args) {
        ArreyQueue<Character> Q=new ArreyQueue<>(5);
        System.out.println("is queue empty"+Q.isEmpty());
        System.out.println("input queue element");
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <6 ; i++) {
            Q.enqueue(in.next().charAt(0));
            System.out.println("first=  "+Q.first());
            System.out.println("size "+ Q.size());
        }
        System.out.println("equeu elment after delet is   ");
        while ((!Q.isEmpty())){
            System.out.println(Q.dequeue()+"\t");
        }

        }
    }
