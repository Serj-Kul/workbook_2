package local.home;

import java.util.Scanner;

/**
 * Created by Serj on 04.03.2017.
 */
public class EvenOrOddTernOp {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(a % 2 == 0 ? "Number is Even" : "Number is Odd");
    }
}
