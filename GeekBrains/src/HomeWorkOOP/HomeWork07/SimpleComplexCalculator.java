package HomeWorkOOP.HomeWork07;

public class SimpleComplexCalculator implements ComplexCalculator {
    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() - b.getReal();
        double imaginary = a.getImaginary() - b.getImaginary();
        return new ComplexNumber(real, imaginary);
    }
}
