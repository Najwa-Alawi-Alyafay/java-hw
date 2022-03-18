/**
 * Created by TOSHIBA on 18/03/22.
 */import java.io.*;

public class Josephus {
        static int josephus(int n, int k)
        {
            if (n == 1)
                return 1;
            else
                return (josephus(n - 1, k) + k - 1) % n + 1;
        }
        public static void main(String[] args) {
            int n = 12;
            int k = 2;
            System.out.println("The  place is "
                    + josephus(n, k));
        }
        }
