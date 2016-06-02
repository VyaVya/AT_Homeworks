/**
 * Created by Vlad on 6/3/2016.
 */
public class HarmonicSum {
    public static void main(String[] args) {
        int harmonic = 0;
        int n;
        for (n = 1; n <= 50000; n++){
            //n++;
            harmonic = harmonic + 1/n;
        }
        /*do {
            n++;
            harmonic = harmonic + (1/n);
        } while (n <= 50000);*/
        System.out.println(harmonic);
    }
}
