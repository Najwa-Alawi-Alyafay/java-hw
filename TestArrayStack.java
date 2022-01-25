import java.util.Scanner;

/**
 * Created by TOSHIBA on 23/01/22.
 */
public class TestArrayStack
{
    public static void main(String[] args) {
        ArrayStack<Integer>myStack=new ArrayStack<>(5);
        Scanner in =new Scanner(System.in);
        System.out.println("input interger elements");
        System.out.println("is the stack empty ? "+myStack.isEmpty());
        for (int i = 0; i <5 ; i++) {
            myStack.push(in.nextInt());
            System.out.println("Top element is =  "+myStack.top());
            System.out.println("size of stack is = "+myStack.size());

        }
        for (int i = 0; i <5 ; i++) {
            myStack.pop();
            System.out.println("deleted element is =        "+myStack.pop());
            System.out.println("**************************************");
            System.out.println("Top element after  pop is =      "+myStack.top());
            System.out.println("**************************************");
            System.out.println("is the stack empty ?         "+myStack.isEmpty());
            System.out.println("**************************************");

        }
}}
