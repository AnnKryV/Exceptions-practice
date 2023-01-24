package Task4;

import java.util.Scanner;
public class Main {
    /*Задание 4
----------
1) Устройство работает при температуре
от -10, включительно, до +35, включительно.
2) При помощи кастомного исключения реализуйте
предупреждение о невозможности работы устройства
за пределами температурного диапазона.
3) Получение значения фактической температуры,
на момент работы устройства, реализуйте
через Scanner.*/
    static double temp;

    public static void main(String[] args) throws InvalidTemperatureException{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        temp = Integer.parseInt(scanner.nextLine());

        if (36 < temp){
                throw new InvalidTemperatureException("Device is not valid to work under this temperature");
        } else if (-11 > temp ) {
                throw new InvalidTemperatureException("Device is not valid to work under this temperature");
        }
        System.out.println("Temperature " + temp + " is acceptable for work");
}
}
