package HomeWorks.HomeWork01;


import HomeWorks.OperationLogger;

import java.util.Scanner;

/**
 * Реализовать простой калькулятор
 */
public class Task1_03 {
    OperationLogger operationLogger;
    Task1_03(){
        operationLogger = new OperationLogger("Task02Logger", "Task02Logs.log");
    }

    public void start() {
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
                sayError();
                continue;
            }

            try {
                number1 = Integer.parseInt(words[0]);
                number2 = Integer.parseInt(words[2]);
            } catch (NumberFormatException error) {
                sayError();
                continue;
            }

            if (words[1].length() == 1) {
                operator = words[1].charAt(0);
            } else {
                sayError();
                continue;
            }

            allCondition = true;
        }

        int result = simpleCalculator(number1, operator, number2);

        String message = String.format("%s %s %s = %S", number1, operator, number2, result);
        System.out.print(message);
    }

    public void sayError() {
        System.out.print("Некоректный ввод!\nПопробуйте снова:");
    }

    public int simpleCalculator(int number1, char operator, int number2) {

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
