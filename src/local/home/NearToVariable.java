package local.home;

import static java.lang.Math.abs;

/**
 * Created by Serj on 05.03.2017.
 */
public class NearToVariable {

    public static void main(String[] args) {
        double a = 743.5;
        double b = -75.65;
        double c = 321;

        if (abs(c - a) < abs(c - b)) {
            System.out.println(a + " ближе к " + c);
        } else if (abs(10 - a) == abs(10 - b)) {
            System.out.println(a + " ближе к " + c);
        } else{
            System.out.println(b + " ближе к " + c);
        }

    }

}
