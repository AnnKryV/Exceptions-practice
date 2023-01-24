package Task3;

import java.util.Scanner;
public class Main {
    /*Задание 3
-----------
1) Реализуйте валидацию достаточного наличия
денежных средств на карте при оплате товара.
2) Ввод суммы к оплате реализуйте через Scanner.
3) Используйте throw при обработке исключения.
*/

    static double price;
    static double money;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of money you have: ");
        money = Double.parseDouble(scanner.nextLine());
        validate(price);

    }
    public static void validate(double price) {
        if (money < price) {
            throw new ArithmeticException("Not enough money on card!");
        } else if (money == 0) {
            throw new ArithmeticException("Not enough money on card!");
        }else
        {
            System.out.println("Amount is enough. Have a nice day!");
        }


    }
}
