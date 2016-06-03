import java.util.Scanner;

/**
 * Created by Vladyslav_Yakymenko on 6/2/2016.
 */
public class PrintNumberWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String[] simpleNumbers = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Other"};
        switch (number){
            case 1: System.out.println(simpleNumbers[0]);
                break;
            case 2: System.out.println(simpleNumbers[1]);
                break;
            case 3: System.out.println(simpleNumbers[2]);
                break;
            case 4: System.out.println(simpleNumbers[3]);
                break;
            case 5: System.out.println(simpleNumbers[4]);
                break;
            case 6: System.out.println(simpleNumbers[5]);
                break;
            case 7: System.out.println(simpleNumbers[6]);
                break;
            case 8: System.out.println(simpleNumbers[7]);
                break;
            case 9: System.out.println(simpleNumbers[8]);
                break;
            default: System.out.println(simpleNumbers[2]);
                break;
        }
        /*if (number == 1){
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
            System.out.println(simpleNumbers[9]);*/
    }

}
