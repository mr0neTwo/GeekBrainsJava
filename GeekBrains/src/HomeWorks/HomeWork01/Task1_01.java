package HomeWorks.HomeWork01;

import java.util.Scanner;

import static HomeWorks.Utilities.GetIntegerFormConsole;

/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class Task1_01 {

    private final Scanner scanner = new Scanner(System.in);

    public void start() {

        int number = GetIntegerFormConsole(scanner, "Введите число для расчета n-го треугольного чилса: ");
        int triangularNumber = calculateTriangularNumber(number);
        String message = String.format("Теругольноче число числа %s равно %s", number, triangularNumber);
        System.out.println(message);

        number = GetIntegerFormConsole(scanner, "Введите число для расчета факториала: ");
        int factorialNumber = calculateFactorial(number);
        message = String.format("Факториал числа %s равно %s", number, factorialNumber);
        System.out.println(message);
    }

    private int calculateTriangularNumber(int number) {
        if (number < 1) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }

        return result;
    }

    private int calculateFactorial(int number) {
        if (number < 1) {
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
