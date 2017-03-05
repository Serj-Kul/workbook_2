package local.home;

import java.util.Scanner;

/**
 * Created by Serj on 04.03.2017.
 */
public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

}
