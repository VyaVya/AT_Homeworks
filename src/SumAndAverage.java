/**
 * Created by Vladyslav_Yakymenko on 6/2/2016.
 */
public class SumAndAverage {
    public static void main(String[] args) {
        int sumOfNumbers = 0;
        int i = 0;
        do {
            i++;
            sumOfNumbers = sumOfNumbers + i;
        } while (i <= 100);
        System.out.println(sumOfNumbers);
    }
}