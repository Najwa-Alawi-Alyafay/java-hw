
import java.util.Scanner;
public class TestSingleLinkedList {
        public static void main(String[] args) {
            SingleLinkedList<Integer> list = new SingleLinkedList<>();
            Scanner input = new Scanner(System.in);
            System.out.println("1-Add first \n 2-Add last \n 3-Remove first \n 0-Exit");
            int choice = -1;
            while (choice != 0) {
                System.out.print("your choice :");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("INPUT  NUMBER");
                        list.addfirst(input.nextInt());
                        System.out.println("FIRST NUMBER = " + list.first() + "\tLAST NUMBER = " +
                                "" + list.last() + "\t SIZE= " + list.size());
                        break;

                    case 2:
                        System.out.println("INPUT A NUMBER");
                        list.addlast(input.nextInt());
                        System.out.println("first= " + list.first() + "\tlast= " +
                                "" + list.last() + "\t size= " + list.size());
                        break;

                    case 3:
                        System.out.println("REMOVE FIRST  " + list.removefirst());
                        System.out.println("first= " + list.first() + "\tlast= " +
                                "" + list.last() + "\t size= " + list.size());
                        break;
                    case 0:
                        System.exit(0);
                        break;
                }}}}
