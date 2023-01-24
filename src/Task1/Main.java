package Task1;

import java.util.Scanner;

public class Main {

    static int number;
//    Задание 1
//            -----------
//    Реализуйте обработку исключения NumberFormatException
//    при вводе значения через Scanner.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        while (true){
            try {
                number = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Wrong! Please, try again");
                break;
            }
             }
        System.out.println("Format accepted: " + number);
        }
    }



