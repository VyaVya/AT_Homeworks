/**
 * Created by Vlad on 6/2/2016.
 */
public class ComputePI {

    /**
     * Monte Carlo method
     * @param args
     */
    public static void main(String[] args) {
        int innerCount = 0;//q-ty of dots that belongs to the circle
        int count = 20000;//full q-ty of dots
        double x, y;//coordinates
        double p;//result

        for (int i = 0; i < count; i++) {
            x = (Math.random() * 2) - 1;
            y = (Math.random() * 2) - 1;
            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1)
                innerCount++;
        }

        p = (double) 4 * innerCount / count;
        System.out.println("Generated number PI " + p);

    }
}
