/**
 * Created by Vlad on 5/23/2016.
 */
public class QuadEqua {

    public static void main(String[] args) {
        double a = 7;
        double b = 33;
        double c = 16;

        double x1;
        double x2;

        x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println(x1);
        System.out.println(x2);

    }

}