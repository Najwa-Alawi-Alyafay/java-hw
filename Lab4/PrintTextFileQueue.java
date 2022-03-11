
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by TOSHIBA on 30/01/22.
 */
public class PrintTextFileQueue {
    public static void main(String[] args) throws FileNotFoundException {
    ArreyQueue<String >myQueue=new ArreyQueue<>(3);
    Scanner in=new Scanner(System.in);
        System.out.println("input file names to print in cinsole");
        for (int i = 0; i <3 ; i++) {
            myQueue.enqueue(in.next());
        }
        System.out.println("print files in  queue");
while (!myQueue.isEmpty()) {
    Scanner filescan = new Scanner(new File(myQueue.dequeue()));
    while (filescan.hasNextLine()) ;
}}
}
