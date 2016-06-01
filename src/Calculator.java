import java.util.Scanner;

/**
 * Created by Vlad on 6/2/2016.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter number >> operator >> number to perform math operation:");
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        //String operator = scanner.nextLine();
        char operator = scanner.next().charAt(0);
        double b = scanner.nextDouble();

        CalcOperations calc = new CalcOperations();

        if (operator == '+'){
            //calc.addition(a, b);
            System.out.println(calc.addition(a, b));
        } else if (operator == '-'){
            //calc.substraction(a, b);
            System.out.println(calc.substraction(a, b));
        } else if (operator == '*'){
            //calc.multiplication(a, b);
            System.out.println(calc.multiplication(a, b));
        } else if (operator == '/'){
            //calc.division(a, b);
            System.out.println(calc.division(a, b));
        } else
            System.out.println("Please, enter math operator(+,-,*,/)");
    }
}
