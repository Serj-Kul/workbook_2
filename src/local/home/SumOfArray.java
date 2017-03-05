package local.home;

/**
 * Created by Serj on 05.03.2017.
 */
public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {10, 74, 47, 32, 56, 21};
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Sum of array elements is: " + sum);
    }
}
