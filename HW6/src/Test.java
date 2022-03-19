/**
 * Created by TOSHIBA on 19/03/22.
 */
public class Test {
        public static void main(String[] args)
        {
            StackUsingLinkedlist obj = new StackUsingLinkedlist();
            obj.push(11);
            obj.push(22);
            obj.push(33);
            obj.push(44);
            obj.display();
            System.out.printf("\nTop element is %d\n", obj.peek());
            obj.pop();
            obj.pop();
            obj.display();
            System.out.printf("\nTop element is %d\n", obj.peek());
        }
    }
