package local.home;

import static java.lang.Math.abs;

/**
 * Created by Serj on 05.03.2017.
 */
public class NearToTen {

    public static void main(String[] args) {
        double a = 12.5;
        double b = -7.65;

        if (abs(10 - a) < abs(10 - b)) {
            System.out.println(a + " ближе к 10");
        } else if (abs(10 - a) == abs(10 - b)) {
            System.out.println(a + " ближе к 10");
        } else{
            System.out.println(b + " ближе к 10");
        }

    }

}
