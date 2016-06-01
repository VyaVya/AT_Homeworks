import java.util.Scanner;

/**
 * Created by Vlad on 6/1/2016.
 */
public class BubbleSortAlg {

        public static void main(String []args) {
            int c, d, swap;

            System.out.println("Enter 10 integers");
            Scanner in = new Scanner(System.in);
            int array[] = new int[10];

            for (c = 0; c < 10; c++)
                array[c] = in.nextInt();

            for (c = 0; c < ( 10 - 1 ); c++) {
                for (d = 0; d < 10 - c - 1; d++) {
                    if (array[d] > array[d+1]) /* For descending order use < */
                    {
                        swap       = array[d];
                        array[d]   = array[d+1];
                        array[d+1] = swap;
                    }
                }
            }

            System.out.println("Sorted list of numbers");

            for (c = 0; c < 10; c++)
                System.out.println(array[c]);
        }
}