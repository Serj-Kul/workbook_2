package local.home;

import java.util.Scanner;

/**
 * Created by Serj on 05.03.2017.
 */
public class LinearSearchElement {
    public static void main(String[] args) {
        int counter, num, item, array[];

        // объект для считывания чисел, введенных пользователем в консоль
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        num = input.nextInt();

        // создаем пустой массив, размера указанного выше
        array = new int[num];

        // просим пользователя заполнить массив, вводя элементы в консоль
        System.out.println("Введите " + num + " чисел");

        // цикл по размеру массива - вводим числа в консоль
        for (counter = 0; counter < num; counter++) {
            array[counter] = input.nextInt();
        }
        System.out.println("Введите число, которое надо найти: ");
        item = input.nextInt();

        for (counter = 0; counter < num; counter++) {
            if (array[counter] == item) {
                System.out.println(item + " является " + (counter + 1)
                        + " по счету в массиве");
                // Число найдено, следовательно прекращаем поиск
                // вызовом оператора break
                break;
            }
        }
        if (counter == num) {
            System.out.println("Число " + item + " не найдено в массиве");
        }
    }
}
