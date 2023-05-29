package HomeWorkOOP.HomeWork07;

class LoggingComplexCalculator implements ComplexCalculator {
    private ComplexCalculator calculator;
    private Logger logger;

    public LoggingComplexCalculator(ComplexCalculator calculator, Logger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.add(a, b);
        String log = String.format("Выполнено сложение: %s + %s = %s", a, b, result);
        logger.log(log);
        return result;
    }

    @Override
    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.subtract(a, b);
        String log = String.format("Выполнено вычитание: %s - %s = %s", a, b, result);
        logger.log(log);
        return result;
    }
}
