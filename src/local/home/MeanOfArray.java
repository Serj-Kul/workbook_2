package local.home;

import java.util.Scanner;

/**
 * Created by Serj on 05.03.2017.
 */
public class MeanOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int mean =0; // среднее арифметическое
        System.out.print("Enter the elements: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        for ( int num : array) {
            mean = mean + num;
        }
        System.out.println("Среднее арифметическое всех элементов массива равен "
                + (mean / 10));
    }
}
