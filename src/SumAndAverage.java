
public class SumAndAverage {
    public static void main(String[] args) {
        int sumOfNumbers = 0;
        int[] arrayOf100Items = new int[100];
        for (int i = 0; i < 100; i++) {
            arrayOf100Items[i] = i;
        }
        for (int i = 0; i < arrayOf100Items.length; i++) {
            sumOfNumbers = sumOfNumbers + arrayOf100Items[i];
        }
        System.out.println("Sum of numbers is: " + sumOfNumbers);
        int average = sumOfNumbers/100;
        System.out.println("Average number is: " + average);
    }
}