package Task2;

import java.util.Scanner;

public class Main {
    /*Задание 2
------------
1) На протяжении 5 дней фиксировалась различная цена
товара на товарной бирже.
2) Реализуйте средствами Scanner поиск значения цены
по индексу в массиве цен.
3) Обработайте неправильный ввод индекса.*/
    static double[] prices;
    static int index;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        prices = new double[]{25.7, 33, 17.5, 40.1, 29.8};
        System.out.println("Enter number of needed day price - 1: ");

        try {
            index = Integer.parseInt(scanner.nextLine());
            if (index > 5) {
                System.out.println("Please, write number less than 5");
            } else if (index == 4) {
                System.out.println(prices[4]);
            } else if (index == 3) {
                System.out.println(prices[3]);
            } else if (index == 2) {
                System.out.println(prices[2]);
            } else if (index == 1) {
                System.out.println(prices[1]);
            } else if (index == 0) {
                System.out.println(prices[0]);
            }

        } catch (NumberFormatException e) {
            System.out.println("Wrong! Please, try again");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong! Please, try again");
        }
    }

}

