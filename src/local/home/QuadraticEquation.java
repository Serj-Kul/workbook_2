package local.home;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Serj on 05.03.2017.
 */

public class QuadraticEquation {
    public static void main(String[] args) {

        double a, b, c; // аргументы
        double x1, x2; // корни
        double D; // дискриминант
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = input.nextDouble();
        System.out.print("Enter b: ");
        b = input.nextDouble();
        System.out.print("Enter c: ");
        c = input.nextDouble();
        D = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("a = 0, x = " + (-c / b));
        } else if (D > 0) {
            System.out.println("x1 = " + (-b + Math.sqrt(D)) / 2 * a);
            System.out.println("x2 = " + (-b - Math.sqrt(D)) / 2 * a);
        } else if (D == 0) {
            System.out.println("один корень x = " + (-b / 2 * a));
        } else {
            System.out.println("корней нет");
        }

    }
}