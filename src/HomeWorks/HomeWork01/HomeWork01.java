package HomeWorks.HomeWork01;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork01 {

    public static void CheckHomeWork01(){
        Task01();
        Task02();
        Task03();
    }

    /**
     * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
     */
    public static void Task01() {
        int number = GetIntegerFormConsole("Введите число для расчета n-го треугольного чилса: ");
        int triangularNumber = CalculateTriangularNumber(number);
        String message = String.format("Теругольноче число числа %s равно %s", number, triangularNumber);
        System.out.println(message);

        number = GetIntegerFormConsole("Введите число для расчета факториала: ");
        int factorialNumber = CalculateFactorial(number);
        message = String.format("Факториал числа %s равно %s", number, factorialNumber);
        System.out.println(message);
    }

    /**
     * Вывести все простые числа от 1 до 1000
     */
    public static void Task02(){
        int from = 1;
        int to = 1000;
        String massage = String.format("Простые числа в диапазоне %s - %s:", from, to);
        System.out.println(massage);
        PrintSimpleNumbers(from, to);
    }


    /**
     * Реализовать простой калькулятор
     */
    public static void Task03(){
        System.out.println("Калькулятор");
        System.out.print("Введите через пробел число оператор число, напирмер, \"2 * 2\"\n");
        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        char operator = ' ';
        boolean allCondition = false;

        while (!allCondition) {
            String expression = input.nextLine();
            String[] words = expression.split(" ");

            if (words.length != 3) {
                SayError();
                continue;
            }

            try{
                number1 = Integer.parseInt (words[0]);
            } catch (NumberFormatException error) {
                SayError();
                continue;
            }

            try{
                number2 = Integer.parseInt (words[2]);
            } catch (NumberFormatException error) {
                SayError();
                continue;
            }

            if (words[1].length() == 1){
                operator = words[1].charAt(0);
            } else {
                SayError();
                continue;
            }

            allCondition = true;
        }

        int result = SimpleCalculator(number1, operator, number2);

        String message = String.format("%s %s %s = %S", number1, operator, number2, result);
        System.out.print(message);
    }

    static void SayError() {
        System.out.print("Некоректный ввод!\nПопробуйте снова:");
    }

    public static int GetIntegerFormConsole(String massage){
        Scanner input = new Scanner(System.in);
        System.out.print(massage);
        while (!input.hasNextInt()){
            System.out.print("Некоректный ввод!\nВведите целое число:");
            input.next();
        }
        return input.nextInt();
    }

    public static int CalculateTriangularNumber(int number){
        if (number < 1){
            return 0;
        }
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }

        return result;
    }

    public static int CalculateFactorial(int number){
        if (number < 1){
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void PrintSimpleNumbers(int from, int to){

        ArrayList<Integer> dividers = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        int firstSimpleNumber = 2;

        for (int i = firstSimpleNumber; i < to + 1; i++) {

            int dividerCount = 0;
            for (int divider: dividers) {
                if (i % divider == 0) {
                    dividerCount++;
                }
            }

            if (dividerCount == 0){
                dividers.add(i);
                if (i > from){
                    result.append(i);
                    result.append(", ");
                }
            }
        }
        result.deleteCharAt(result.lastIndexOf(","));
        System.out.println(result);
    }

    public static int SimpleCalculator(int number1, char operator, int number2){

        switch (operator) {
            case '*' -> {
                return number1 * number2;
            }
            case '/' -> {
                return number1 / number2;
            }
            case '+' -> {
                return number1 + number2;
            }
            case '-' -> {
                return number1 - number2;
            }
            default -> {
                System.out.print("Введенная операция не поддерживаетя");
                return 0;
            }
        }
    }
}
