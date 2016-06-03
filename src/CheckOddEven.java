import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Number " + number + " is even");
            } else
                System.out.println("Number " + number + " is odd");
        } else
            System.out.println("Enter number with type integer");
    }
}
