package HomeWorkOOP.HomeWork07;

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return String.format("%.0f+%.0fi",real, imaginary);
        } else {
            return String.format("%.0f-%.0fi",real, -imaginary);
        }
    }
}
