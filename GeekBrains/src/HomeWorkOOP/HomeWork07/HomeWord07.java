package HomeWorkOOP.HomeWork07;

import java.util.Scanner;

public class HomeWord07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ComplexCalculator calculator = new SimpleComplexCalculator();
        Logger logger = new ConsoleLogger();
        ComplexCalculator loggingCalculator = new LoggingComplexCalculator(calculator, logger);

        System.out.print("Введите первое комплексное число (в формате a+bi): ");
        ComplexNumber a = parseComplexNumber(scanner.nextLine());

        System.out.print("Введите второе комплексное число (в формате a+bi): ");
        ComplexNumber b = parseComplexNumber(scanner.nextLine());

        ComplexNumber sum = loggingCalculator.add(a, b);
        ComplexNumber difference = loggingCalculator.subtract(a, b);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
    }

    private static ComplexNumber parseComplexNumber(String input) {
        // Парсим действительную и мнимую части из строки
        String[] parts = input.split("\\+");
        double real = Double.parseDouble(parts[0]);
        double imaginary = Double.parseDouble(parts[1].replace("i", ""));
        return new ComplexNumber(real, imaginary);
    }
}
