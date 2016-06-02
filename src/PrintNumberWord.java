import java.util.Scanner;

/**
 * Created by Vladyslav_Yakymenko on 6/2/2016.
 */
public class PrintNumberWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int number = scanner.nextInt();

        String[] simpleNumbers = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Other"};
        if (number == 1){
            System.out.println(simpleNumbers[0]);
        } else if (number == 2){
            System.out.println(simpleNumbers[1]);
        } else if (number == 3){
            System.out.println(simpleNumbers[2]);
        } else if (number == 4){
            System.out.println(simpleNumbers[3]);
        } else if (number == 5){
            System.out.println(simpleNumbers[4]);
        } else if (number == 6){
            System.out.println(simpleNumbers[5]);
        } else if (number == 7){
            System.out.println(simpleNumbers[6]);
        } else if (number == 8){
            System.out.println(simpleNumbers[7]);
        } else if (number == 9){
            System.out.println(simpleNumbers[8]);
        } else
            System.out.println(simpleNumbers[9]);
    }

}
