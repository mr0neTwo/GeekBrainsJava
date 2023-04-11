package HomeWorks.HomeWork01;

import HomeWorks.OperationLogger;

import java.util.Scanner;
import java.util.Stack;

/**
 * Реализовать простой калькулятор
 */
public class Task1_03 {
    private final OperationLogger operationLogger;
    private final Stack<Integer> currentResult;
    private final Scanner input;

    Task1_03(){
        operationLogger = new OperationLogger("Task02Logger", "Task02Logs.log");
        currentResult = new Stack<>();
        input = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Калькулятор");
        choseOperation();
    }

    private void choseOperation(){
        String message = "Выберете операцию: \n1 - новая операция\n2 - отменить последнюю операцию\nЛюбое другую цифру для выхода";
        boolean condition = true;
        while (condition) {
            System.out.println(message);
            showCurrentResult();
            int operationNumber = input.nextInt();
            switch (operationNumber) {
                case 1 -> newOperation();
                case 2 -> undoLastOperation();
            }
            condition = (operationNumber > 0) && (operationNumber <= 2);
        }
    }

    private void newOperation() {
        System.out.print("Введите через пробел число оператор число, напирмер, \"2 * 2\"\n");

        int number1 = 0;
        int number2 = 0;
        char operator = ' ';
        boolean allCondition = false;

        while (!allCondition) {
            input.nextLine();
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
        System.out.println(message);
    }

    private void showCurrentResult(){

        if(!currentResult.empty()) {
            System.out.print("Текущий результат: ");
            System.out.println(currentResult.peek());
        }
    }

    private void undoLastOperation(){
        currentResult.pop();
        operationLogger.addInfoLog("Отмена последней операции");
    }

    private void sayError() {
        System.out.print("Некоректный ввод!\nПопробуйте снова:");
    }

    private int simpleCalculator(int number1, char operator, int number2) {

        int result = 0;

        switch (operator) {
            case '*' -> {
                result = number1 * number2;
            }
            case '/' -> {
                result = number1 / number2;
            }
            case '+' -> {
                result = number1 + number2;
            }
            case '-' -> {
                result = number1 - number2;
            }
            default -> {
                System.out.print("Введенная операция не поддерживаетя");
            }
        }

        String log = String.format("%s %s %s = %S", number1, operator, number2, result);
        operationLogger.addInfoLog(log);

        currentResult.add(result);

        return result;
    }
}
